/* Lesson 4 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L4_Activity_Four{

  /* Add the method hasRepeat here */
  
  public static boolean hasRepeat (String x)
  {
    boolean repeat = false; 
    for (int i= 0; i<x.length()-1; i++)
    {
      String itterate = x.substring (i, i+1);
      String itterate_next = x.substring(i+1,i+2);
      if (itterate.equals(itterate_next))
      {
         repeat = true; 
         return repeat;
      }
      else 
      {
         repeat = false;
   
      }
    }
      return repeat;
  }

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score


  
}