/* Lesson 1 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L1_Activity_Two{
  public static void main(String[] args){
    
  Scanner scan = new Scanner (System.in);
  System.out.println("Enter the Scores:");
  
    double sum = 0;
    double avg = 0;
    int n = 0;
    int c = 0;
    while (n != -1)
    {
      n=scan.nextInt();
      if (n != -1)
      {
        sum+=n;
        c++;
      }
      else
      {
        
      }
    }
    avg = sum/c;
    System.out.println("The average is: "+ (double)avg);

  

    
  }
}