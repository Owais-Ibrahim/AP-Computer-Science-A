/* Lesson 1 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L1_Activity_Four{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a number:");
    int num = scan.nextInt();
    double mod = num%2;
    if (mod==0)
    {
      System.out.println("Even");
    }
    
    else
    {
      System.out.println("Odd");
    }
    
  }
}