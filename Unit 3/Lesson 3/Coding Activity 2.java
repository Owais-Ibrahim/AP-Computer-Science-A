/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;

public class U3_L3_Activity_Two{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
  
    System.out.println("Please enter an integer:");
    int num = scan.nextInt();
    if (num==4)
    {
        System.out.println("A");
    }
   else if (num==3)
    {
        System.out.println("B");
    }
    else if (num==2)
    {
        System.out.println("C");
    }
    else if (num==1)
    {
        System.out.println("D");
    }
    else if (num==0)
    {
        System.out.println("F");
    }
      
  }
}