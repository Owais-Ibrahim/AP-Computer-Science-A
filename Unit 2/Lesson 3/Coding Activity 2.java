/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two{
  public static void main(String[] args){
  
    Scanner scan= new Scanner (System.in);
    
    System.out.println("Enter a string:");
    String in = scan.nextLine();
    int len = in.length();
    String out = in.substring(1,(len-1));
    
    
    
    System.out.println(out);
  
  }
}