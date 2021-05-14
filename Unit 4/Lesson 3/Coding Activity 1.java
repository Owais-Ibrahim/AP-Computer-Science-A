/* Lesson 3 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L3_Activity_One{
  public static void main(String[] args){
    int count = 0;
    
    for (int i=23; i<= 89; i++)
    {
       System.out.print(i+" ");
      count++;
      if (count==10)
      {
        System.out.println("");
        count=0;
      }
     
    }
      
    
  }
}