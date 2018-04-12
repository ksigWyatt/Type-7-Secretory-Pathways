/*
    © 2018 Wyatt Baggett
    04.12.18
*/


import java.io.*;
import java.util.*;

public class Main {
	
	public static int group = 1;
	public static int lineNumInGroup = 0;
	public static int totalFound = 0;
	public static String arrayOfLines[] = null;
	public static ArrayList<String[]> list = new ArrayList<String[]>(); // safer than an array
	
	public static void main(String[] args) {
		
		String fileName = "ORFs.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    int i = 0;
		    
		    while (line != null) {
		    	    	
		    		// used for showing exactly where the codes are found
		    		if (line.isEmpty()) {
		    			group++;
		    			lineNumInGroup = 0;
		    		}
		    		
		    		getMatchesFromFile(line, ++i);
		    		lineNumInGroup++;
		    		
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total matches found in " + fileName + ": " + totalFound);
		
		try (FileWriter writer = new FileWriter("T7s-found.txt" )) {

		    // read the data from the array list we populated earlier and then write a file so we can view the result
		    for(String[] arr: list) {
		        String appender = "";
		        for(String lines : arr){
		            writer.write(lines);
		        }
		        writer.write("\n");
		        writer.flush();
		    }
		    writer.write("\nTotal matches found in " + fileName + ": " + totalFound);
		    writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// this is just a quick check to make sure that the line contains the right characters
	// if so then we determine how many per line and what substring might be valid
	public static void getMatchesFromFile(String line, int num) {
		
		if (line.contains("F")) {
			findSubstrings(line, 'F', num);
		}
		
		if (line.contains("W")) {
			findSubstrings(line, 'W', num);
		}
		
		if (line.contains("Y")) {
			findSubstrings(line, 'Y', num);
		}
	}
	
	public static void findSubstrings(String line, char letter, int lineNum) {
		
		String returnedLine = "";
		int lineLength = line.length() - 1;
		int index = line.indexOf(letter);
		
		// for all occurrences of the letter in question
		while (index >= 0) {
		    
			int rightBound = index + 4;
		    
		    if (rightBound <= lineLength) {
	    			
		    		if (line.charAt(rightBound) == 'D' || line.charAt(rightBound) == 'E') {
		    			
		    			totalFound++;
		    			// This was the best way to do this, since doing it all in one line makes adding charAt int type
		    			returnedLine += line.charAt(index);
		    			returnedLine += line.charAt(index+1);
		    			returnedLine += line.charAt(index+2);
		    			returnedLine += line.charAt(index+3);
		    			returnedLine += line.charAt(rightBound);
		    			
		    			String printString = returnedLine + " beginning on the index " + index + " and ending at " 
		    									+ rightBound + "." + "\nFound on line number " + lineNumInGroup + 
		    									" under group " + group + " (see global line # " + lineNum + ")";
		    			
		    			list.add(new String[] {printString});
		    		}
		    }
		    // continue to iterate
		    index = line.indexOf(letter, index + 1);
		}
	}
}
