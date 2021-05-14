/* Lesson 2 Coding Activity Question 2 */

import java.util.Scanner;

public class U4_L2_Activity_Two
{
  public static void main(String[] args)
  {

    Scanner scan = new Scanner (System.in);
    System.out.println("Enter a positive integer:");
    int input = scan.nextInt();
    int digit=0;
    while(input>0)
    {
      digit = input%10;
      System.out.println(digit);
      input/=10;
    }
    

  }
}
