/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L2_Activity_Three{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a test score:");
    double num = scan.nextDouble();
    if (num<0 || num>100)
    {
    System.out.println("Not Valid");
    }
  
  }
}