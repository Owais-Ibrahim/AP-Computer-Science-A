/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter Strings:");
    
    String one = scan.nextLine();
    String two = scan.nextLine();
    
    
    if(one.length()==two.length())
    {
      for (int i =0; i<one.length(); i++)
      {
        String output1 = one.substring(i,i+1);
        String output2 = two.substring(i,i+1);
       System.out.print(output1 + output2) ;
      }
    }
    else
    {
      System.out.println("error");
    }
    
    
  }
}