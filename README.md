# Type 7 Secretory Pathways
Identify Type 7 Secretory Pathways in Bacillus Bacteriophage within any sequence. This is the first time this secretory pathway has ever been found in gram positive bacteria. Featured at Florida International University in Miami, FL.

## How It Works
- Data for the ORFs must be presented within a `.txt` file - with each newline containining each line of the sequence.
- Name this file `ORFs.txt`
- Using the given methods for identifying T7s, the program will create a file named `T7s-found.txt`. This file will contain the specific information as to where the T7s are located within the sequence. 

*There is theoredically no limit to the scale of the data that this program can iterate through, however it is built with linear `O(n)` performance.*
