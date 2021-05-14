/* Lesson 7 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L7_Activity_Two{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter 2 strings:");
    String one = scan.nextLine();
    String two = scan.nextLine();
    String substring_one = one.substring(0,one.length()-1);
    String substring_two = two.substring(0,two.length()-1);
    
    if (one.equals(two))
    {
      System.out.println("Great!");
    }
    
    else if (substring_one.equals(substring_two))
    {
      System.out.println("Close enough");
    }
    else{
      System.out.println("Try again");
    }
    
  }
}