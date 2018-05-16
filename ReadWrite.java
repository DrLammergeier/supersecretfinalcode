import java.io.*;
import java.util.Scanner;

public class ReadWrite{
	public static String read(Scanner inFile){
      String fileParse = "";
      while(inFile.hasNextLine())
      {      
         fileParse += inFile.nextLine();
         fileParse += "\r";
         fileParse += "\n";
         //that could all be done in one line but takes longer to write out
      }
      fileParse = fileParse.substring(0, fileParse.length() - 2);
      inFile.close();
		return fileParse;
	}//end read
	
	public static Scanner open_file(String	file_name, Scanner input) 
   {
      try
      {
         File tempFile = new File(file_name);
         input = new Scanner(tempFile);
      }
      catch(Exception e)
      {
         System.out.println("Unable to open file! File not found!");
      }
		return input;
	}//end open_file
   
   public static void write(String file_name, String message)
   {
      File file = new File(file_name);
      PrintWriter printWriter = null;
      try
      {
          printWriter = new PrintWriter(file);
          printWriter.println(message);
      }
      catch (FileNotFoundException e)
      {
          e.printStackTrace();
      }
      finally
      {
          if ( printWriter != null ) 
          {
              printWriter.close();
          }
      }
      
   }//end write method
}// end class File