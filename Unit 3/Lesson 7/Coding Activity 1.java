/* Lesson 7 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L7_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a password:");
    String pass = scan.nextLine();
    if (pass.equals("swordfish"))
    {
        System.out.println("Access granted!");
    }
    else
    {
      System.out.println("Access denied!");
    }
    
  }
}