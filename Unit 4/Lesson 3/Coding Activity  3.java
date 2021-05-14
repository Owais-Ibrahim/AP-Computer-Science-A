/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L3_Activity_Three{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a number between 0 and 100:");
    int input = scan.nextInt();
    int c=0;
    if (input<100 && input>0)
    {
        
    for (int i = input; i<=100; i++)
    {
      
      if(c==20)
      {
        System.out.println("");
        c=0;
      }
      System.out.print(i+" ");
      c++;
    }
    }
    else
    {
      System.out.println("error");
    }
 
    
    
  }
}