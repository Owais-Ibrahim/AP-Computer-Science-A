/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L3_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please enter an integer");
    int num = scan.nextInt();
    if (num<0)
    {
      System.out.println("Negative");
    }
    else
    {
      System.out.println("Positive");
    }
  }
}