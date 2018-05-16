import java.util.Scanner;

public class Caesar{
   public static String decrypt(String message, int cipher) 
   {
		String decrypted = "";
      
      int[] intArray = getArray(message);
      for (int i = 0; i < intArray.length; i++)
      {
         if(intArray[i] >= 65 && intArray[i] <= 90)//Upercase
         {
            if(intArray[i] - cipher < 65)//Wraps
            {
               intArray[i] = intArray[i] - cipher + 26;
               decrypted += (char)intArray[i];
            }
            else//Doesn't wrap
            {
               intArray[i] -= cipher;
               decrypted += (char)intArray[i];
            }
         }
         else if(intArray[i] >= 97 && intArray[i] <= 122)//Lowercase
         {
            if(intArray[i] - cipher < 97)//Wraps
            {
               intArray[i] = intArray[i] - cipher + 26;
               decrypted += (char)intArray[i];
            }
            else//Doesn't wrap
            {
               intArray[i] -= cipher;
               decrypted += (char)intArray[i];
            }
         }
         else
         {
            decrypted += (char)intArray[i];
         }        
      }
		return decrypted;
	}
	
	public static String encrypt(String message, int cipher) 
   {
      //create an empty string for the encrypted message
		String empty = "";
      //if cipher < 0
      if(cipher < 0)
      {
         //cipher += 26
         cipher += 26;
      }
      
      int[] intArray = getArray(message);
      for (int i = 0; i < intArray.length; i++)
      {
         if(intArray[i] >= 65 && intArray[i] <= 90)//Upercase
         {
            if(intArray[i] + cipher > 90)//Wraps
            {
               intArray[i] = intArray[i] + cipher - 26;
               empty += (char)intArray[i];
            }
            else//Doesn't wrap
            {
               intArray[i] += cipher;
               empty += (char)intArray[i];
            }
         }
         else if(intArray[i] >= 97 && intArray[i] <= 122)//Lowercase
         {
            if(intArray[i] + cipher > 122)//Wraps
            {
               intArray[i] = intArray[i] + cipher - 26;
               empty += (char)intArray[i];
            }
            else//Doesn't wrap
            {
               intArray[i] += cipher;
               empty += (char)intArray[i];
            }
         } 
         else
         {
            empty += (char)intArray[i];
         }         
      }
		return empty;
	}
   
   public static int[] getArray(String message) 
   {		
		int[] returnArray = new int[message.length()];
      for (int x = 0; x < message.length(); x++)
      { 
         returnArray[x] = (int)message.charAt(x);
      }
         return returnArray;
	}
   
   public static int[] letterDistr(String message)
   {
      int[] distArr = new int[26];
      int[] messArr = getArray(message);
      int index = 0;
      for (int i = 0; i < messArr.length; i++)
      {
         if(messArr[i] >= 65 && messArr[i] <= 90)//Upercase
         {
            messArr[i] += 32;//LowerCase        
         }

         index = messArr[i] - 97;//Find index
         if (!(index < 0 || index > 25))
         {
            distArr[index] += 1;//Add one to index 
         }              
      }
      
      return distArr;              
   }
   
	public static void printDistr(int[] distr) 
   {
      String characters = "abcdefghijklmnopqrstuvwxyz";
      char tempChar;
      String starCount = "";
      for (int i = 0; i < distr.length; i++)
      {
         tempChar = characters.charAt(i);
         for (int x = 0; x < distr[i]; x++)
         {
            starCount += "*";
         }        
         System.out.print(tempChar + ": " + distr[i] + "|" + starCount + "\n");
         starCount = "";
      }
	} 
}