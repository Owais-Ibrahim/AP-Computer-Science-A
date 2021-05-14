/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L3_Activity_One{
  public static void main(String[] args){
  
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a string:");
    String in= scan.nextLine();
    int num= in.length();
    System.out.println((in.substring(0,1))+(in.substring(num-1)));
  
  }
}