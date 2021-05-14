/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U3_L2_Activity_Four{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("What is the temprature?");
    double temp = scan.nextDouble();
    
    if (temp<99 || temp>102 )
    {
      System.out.println("WARNING");
    }
    else
    {
      System.out.println(temp);
    }
    
  }
}