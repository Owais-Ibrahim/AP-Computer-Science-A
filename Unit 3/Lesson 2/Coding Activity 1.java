/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U3_L2_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please enter 4 doubles:");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    double num3 = scan.nextDouble();
    double num4 = scan.nextDouble();
    
    double avg = (num1+num2+num3+num4)/4;
    
    if(avg>=89.5)
    {
      System.out.println("ABOVE AVERAGE");
    
    }

    
  }
}