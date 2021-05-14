/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.testing.Math;

public class U3_L3_Activity_Three{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    
    int num1 = (int)(12*Math.random()+1);
    int num2 = (int)(12*Math.random()+1);
  
    System.out.println(num1+" * "+num2 +" = ?");
    
    int userAns = scan.nextInt();
    
    int actualAns = num1*num2;
    
    if (userAns==actualAns)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Wrong");
    } 
    

  }
}
