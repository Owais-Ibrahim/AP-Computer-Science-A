/* Lesson 5 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L5_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Input a String:");
    String input = scan.nextLine();
    System.out.println("Input an integer:");
    int integer = scan.nextInt();
    
    for (int i = ((input.length())-1); i>=0; i--)
    {
      for (int j = 0; j<integer; j++)
      {
        System.out.print(input.substring(i, i+1));
      }
    }
    
  }
}