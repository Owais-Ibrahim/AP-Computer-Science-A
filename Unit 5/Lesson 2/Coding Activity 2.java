/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U5_L2_Activity_Two{
  
  public static void reverser(String s)
  {
    String character = "";
    
    for (int i = s.length(); i>0; i--)
    {
      character = s.substring(i-1,i);
      System.out.print(character);
    }
  }

 
  
}