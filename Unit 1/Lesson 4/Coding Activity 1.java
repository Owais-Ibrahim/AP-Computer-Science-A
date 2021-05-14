/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;

class U1_L4_Activity_One{
  public static void main(String[] args){
      
Scanner scan = new Scanner (System.in);
  System.out.println("Enter Starting Number (Must be an integer)");
  int num= scan.nextInt();
    
  for (int i=0;i<3;i++)
  {
    num++;
    System.out.println("number is now "+num);
  }
  for (int j=0; j<3;j++)
  {
    num--;
      System.out.println("number is now "+num);
  
  }


      
  }
}