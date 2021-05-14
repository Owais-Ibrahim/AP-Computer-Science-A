/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter two numbers:");
    double one = scan.nextDouble();
    double two = scan.nextDouble();
    if(one>two)
    {
      System.out.println("Largest is: "+one);
    }
    else if (two>one)
    {
      System.out.println("Largest is: "+two);
    }
    
    else
    {
      System.out.println("Largest is: "+one);
    
    }

  }
}