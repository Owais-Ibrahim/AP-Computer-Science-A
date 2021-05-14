/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;

class U1_L6_Activity_Two {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Please input a decimal number:");
    double num=scan.nextDouble();
    num+=0.5;
    int num_final = (int) num;
    System.out.println("Answer:"+num_final);

  }
}
  