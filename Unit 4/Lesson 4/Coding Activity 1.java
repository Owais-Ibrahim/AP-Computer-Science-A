/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L4_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Input String:");
    String str = scan.nextLine();
    
    int count = 0;
    String substring = "";
    
    for (int i = 0; i<=str.length()-2;i++)
    {
      substring = str.substring(i,i+2);
      System.out.println(substring);
      if(substring.equals("sh") || substring.equals("Sh") ||  substring.equals("SH") || substring.equals("sH"))
      {
        count++;
      }
    }
    System.out.println("Contains \"sh\" " + count+ " times" );
  }
}