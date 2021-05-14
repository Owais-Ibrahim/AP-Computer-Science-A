/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L4_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a number:");
    int num = scan.nextInt();
    if (!(num>=5&&num<=76))
    {
      System.out.println("True");
    }
    else
    System.out.println("False");
    
  }
}