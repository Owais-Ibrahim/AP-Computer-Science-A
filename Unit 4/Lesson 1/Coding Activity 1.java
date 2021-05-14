/* Lesson 1 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L1_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner  (System.in);
    
    System.out.println("Enter positive numbers (-1 to stop)");
    int sum = 0;
    int n = 0;
    while (n != -1)
    {
      n=scan.nextInt();
      if (n != -1)
      {
        sum+=n;
      }
      else
      {
        
      }
    }
    System.out.println("Sum is "+sum);

    
    
  }
}