/* Lesson 4 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L4_Activity_Two{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    int num = scan.nextInt();
    int num2 = scan.nextInt();
    
    if ((num==0 || num>0)&&(num2==0||num2>0))
    {
      System.out.println("Both are positive or zero.");
    }
    else
    {
      System.out.println("One or both are negative.");
    }
    
  }
}