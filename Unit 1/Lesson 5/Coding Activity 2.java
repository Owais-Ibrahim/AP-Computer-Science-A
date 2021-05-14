/* Unit 1 - Lesson 5 - Coding Activity Question 2 */

import java.util.Scanner;

class U1_L5_Activity_Two {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner (System.in);
      System.out.println("Please enter a three digit number:");
      int num= scan.nextInt();
      int done= num/100;
      int dtwo= (num/10)%10;
      int dthree= num%10;
      System.out.println("Here are the digits:");
      System.out.println(dthree);
      System.out.println(dtwo);
      System.out.println(done);
            
    }
}