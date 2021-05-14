/* Unit 1 - Lesson 5 - Coding Activity Question 1 */

import java.util.Scanner;

class U1_L5_Activity_One {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner (System.in);
    System.out.println("Please enter a two digit number:");
    int num= scan.nextInt();
    int done= num/10;
    int dtwo= num%10;
    System.out.println("Here are the digits:");
    System.out.println(done);
    System.out.println(dtwo);

      
    }
}