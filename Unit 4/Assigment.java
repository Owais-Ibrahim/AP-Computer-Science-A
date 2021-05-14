import java.util.Scanner;

class Assignment4 {
  public static void main(String[] args) throws InterruptedException{
        
    Scanner scan = new Scanner (System.in);
    
    //Asking User for Input
    System.out.println("Type the message to be shortened");
    String input = scan.nextLine().toLowerCase();
    Thread.sleep(1000);
    
    //Variables for Algorithm 1
    String itterate = "";
    String itterate_next = "";
    String itterate_back ="";
    String output = "";
    int vowel =0;
    int repeat =0;
    boolean algorithim1 = true;
    
while (algorithim1) //While algorthim 1 hasn't outputted
{
/**Getting the one letter, a letter behind it, and a letter in front of it **/
  
    //Itterate through each character
    for (int i =0; i<input.length(); i++)
    {
      //Getting the character
      itterate = input.substring(i,i+1);
      
      //Getting next character
      if(i<input.length()-1)
      {
       itterate_next = input.substring(i+1,i+2);
      }
      //Getting character before
      if(i>0&&i<input.length())
      {
        itterate_back = input.substring(i-1,i);
      }

/***VOWVEL CHECKER ***/
      
      //Checks to see if its vowel
      if(itterate.equals("a") || itterate.equals("e") ||itterate.equals("i") || itterate.equals("o") || itterate.equals("u"))
      {
 
        //Is it starting the sentence 
        if (i==0)
        {
          //If its the first character of the sentence leave it
          output+=itterate;
        }
        
        //Lets check if its the first letter of the word   
        else if (itterate_back.equals(" "))
        {
          //If its the first character of the word leave it
          output+=itterate;
        }
        
        //Lets check if its alone
        else if(itterate_next.equals(" ") && itterate_back.equals(" "))
         {
           //If vowel has a space before and after it
            output+=itterate;
         }
         
         else
         {
            //If vowel is in the middle of the word omit it and count deletions
            vowel++;
         }
         
      }

/***Repition***/
      
      //If its not vowel then is it the character being repeated
      else if(i<input.length()-1 && itterate.equals(input.substring(i+1,i+2)))
      {
        //if character is repeated in front we delete repeted character
        repeat++;
      }
    
      //Not a vowel and not repeated  
      else
      {
        //if character is not a vowel and isn't being repeated add it
         output+=itterate;
      }
    }

    //Print Algorithm 1
    System.out.println("\nAlgorithm 1");
    System.out.println("Vowels removed: " + vowel );
    System.out.println("Repeats removed: "+ repeat);
    System.out.println("Algorithm 1 message: " + output);
    System.out.println("Algorithm 1 characters saved: "+(repeat+vowel));
    algorithim1 = false;    
  
}
    
    
  /***Algorithm 2***/
  
  //Algorithim 2 variables
  //input is the input from user
  
  int unique_char =0;
  int num = 0;
  
  //Making a copy and holding it
  String input_copy = input;
  
  String itterate_copy = "";
  
  String final_message ="";

  
  for (int j =0; j<input_copy.length()+1; j++)
  {
    //Replacing space with nothing
    input_copy = input_copy.replace(" ","");
    
    //Going through each character in the string
    itterate = input_copy.substring(0,1);

      //Go throught a copy of the string. This string will be modified and remove unique characters once matched 
      for (int k =0; k<input_copy.length(); k++)
      {
        itterate_copy = input_copy.substring(k,k+1);
        if (itterate.equals(itterate_copy))
        {
          num++;
        }
      }
      unique_char++;
      input_copy = input_copy.replace(itterate,"");
      final_message = final_message + num + itterate;
      num=0;
      j=0;
  }
  
  
  //Print Algorithm 2
    System.out.println("\nAlgorithm 2");
    System.out.println("Unique characters found: " + unique_char);
    System.out.println("Algorithm 2 message: " + final_message);
    System.out.println("Algorithm 2 characters saved: " + (input.length()-final_message.length()) ); 
    //this message could be a little shorter
    
    
  }
}
  


