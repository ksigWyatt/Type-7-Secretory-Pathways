# Type 7 Secretory Pathways
Identify Type 7 Secretory Pathways in [*Bacillus*](https://www.ncbi.nlm.nih.gov/books/NBK7699/) Bacteriophage within any sequence. This is the first time this secretory pathway has ever been found in *Bacillus*. Featured within the Science Education Alliance-Phage Hunters Advancing Genomics and Evolutionary Science (SEA-PHAGES) program at Florida International University in Miami, FL.

### Technology
Built using Eclipse Oxygen & Java 9 - `Buffered Reader` (see [note](https://github.com/ksigWyatt/Type-7-Secretory-Pathways#note) below), `File Writer`

## How It Works
- Data for the Open Reading Frames or ORFs must be presented within a `.txt` file - with each newline containining each line of the sequence. Use the existing `ORFs.txt` file that contains some sample data as an example of how to properly present the data as follows:
  - Place each line of the ORFs into the text file on a seperate line each time. 
    - *(ex line 1: MCYNSYTQLNTSFNRQFTKHLDIH line 2: MWYTVYAINLSRVYN)*
  - Between each grouping, enter a blank line
  - Name this file `ORFs.txt`
- Using the given methods for identifying T7s, the program will create a file named `T7s-found.txt`. This file will contain the specific information as to where the T7s are located within the sequence with the total count of the number of matches found at the bottom and top of the file. 

## Running The Program
- Simply download the source as a ZIP using the green button
- Double click on `Find-T7s.jar` in the `ORFs` folder and again ensure that the `ORFs.txt` file is in the same folder.
- The output should instantly appear within the folder that the `.jar` file resides. This file contains detailed information about where the T7 resides in each line. 
- The explination for where each sequence can be found is as detailed as possible in an effort to assist researchers by showing exactly where on each line, in a specific group the T7 is found.
- In the event that the `.jar` file displays an error, double clicking on the `Main.class` file inside the `bin` folder will perform the same action. Simply copy the `ORFs.txt` file into the bin folder.

## Testing & Runtime
This algorithm has been confirmed to find all intances of T7s in the text data. (See the [note](https://github.com/ksigWyatt/Type-7-Secretory-Pathways#note) below regarding much larger data sets)

#### Big Data
The following screenshot is the total runtime of the algorithm with a vastly larger set of data, with a combined overal data length of 2.9 million lines of text totalling 55.8MB file size. The program ran in just over 1200ms (1.2sec) and found all 354,000 matches in the set of over 349,000 ORF groups.

<img width="758" alt="screen shot 2018-04-21 at 2 20 53 am" src="https://user-images.githubusercontent.com/22202975/39081191-d3b4e1de-450a-11e8-8316-1f80eb3cfe61.png">

#### NOTE
*There is theoredically no limit to the scale of the data that this program can iterate through, however it is built with linear `O(n)` performance through Java's `Buffered Reader`. This performance is limited by how java reads the contents of the file - each line one at a time in sequence. Much larger data sets will require some tweaks to how this program reads the input data in order to achieve closer to `O(n^2)` performance.*

## License
License.md can be found [here](https://github.com/ksigWyatt/Type-7-Secretory-Pathways/blob/master/LICENSE).
