import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner file){
      string fileParse;
      //create a string to hold the message
      File file = new File("");
      //get the first line from the file
      Scanner sc = new Scanner(file); 
      //while the file has a next line
      while(sc.hasNextLine()){
         fileParse += "\r";
         fileParse += "\n";
         fileParse += in.nextLine();
         //that could all be done in one line but takes longer to write out
      }
      file.close();
		return fileParse;
	}//end read
	
	public static Scanner open_file(String	file_name, Scanner input) {
      //try
      try{
         //create a File object based on file_name
         File file = new File
         //change the Scanner input to read from the File object
         
      //catch if the file isn't found
         //Display appropriate error message
		return input;
	}//end open_file
   
   public static void write(String file_name, String message){
      //try
         //create a PrintWriter object based on file_name
         //print the message to the PrintWriter object
         //close the PrintWriter object 
      //catch if the file is not found - eventhough java is making a file, so it doesn't need to be there first --stupid java
        //display appropriate error message
   }//end write method
}// end class File