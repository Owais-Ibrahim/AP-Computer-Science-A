/* Lesson 6 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);
   
    System.out.println("Please input a decimal number:");
    
    double num = scan.nextDouble();
    int final_num =  (int)(num*100);
    int digit2= final_num%10;
    int digit1= final_num%100/10;
    
    
    System.out.println(digit1+" "+digit2);

    
  }
}
