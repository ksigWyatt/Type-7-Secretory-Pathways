# Type 7 Secretory Pathways
Identify Type 7 Secretory Pathways in [*Bacillus*](https://www.ncbi.nlm.nih.gov/books/NBK7699/) Bacteriophage within any sequence. This is the first time this secretory pathway has ever been found in *Bacillus*. Featured within the Science Education Alliance-Phage Hunters Advancing Genomics and Evolutionary Science (SEA-PHAGES) program at Florida International University in Miami, FL.

## How It Works
- Data for the Open Reading Frames or ORFs must be presented within a `.txt` file - with each newline containining each line of the sequence. (Use the existing `ORFs.txt` file that contains some sample data as an example of how to properly present the data as follows:
  - Place each line of the ORFs into the text file on a seperate line each time. 
    - *(ex line 1: MCYNSYTQLNTSFNRQFTKHLDIH line 2: MWYTVYAINLSRVYN)*
  - Between each grouping, enter a blank line
  - Name this file `ORFs.txt`
- Using the given methods for identifying T7s, the program will create a file named `T7s-found.txt`. This file will contain the specific information as to where the T7s are located within the sequence with the total count of the number of matches found at the bottom and top of the file. 

## Running The Program
- Double click on `Find-T7s.jar` and again ensure that the `ORFs.txt` file is in the same folder.
- The output should instantly appear within the folder that the `.jar` file resides. This file contains detailed information about where the T7 resides in each line. 
- The explination for where each sequence is as detailed as possible in an effort to help find exactly where on each line, in a specific group the T7 is found.

## Testing
This algorithm has been confirmed to find all intances of T7s in the text data. (See note below regarding much larger data sets)

*NOTE: There is theoredically no limit to the scale of the data that this program can iterate through, however it is built with linear `O(n)` performance. Much larger data sets will require some tweaks to this algorithm in order to achieve O(log n).*
