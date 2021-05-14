/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One{
  public static void main(String[] args){
      
    Scanner scan = new Scanner (System.in);
    
    System.out.println("What type of item are you buying?");
    String name = scan.nextLine();
    System.out.println("How many are you buying?");
    int num = scan.nextInt();
    System.out.println("How much does each one cost?");
    double price = scan.nextDouble();
    System.out.println(num+" "+name +" at $"+price+" each will cost you $"+((price*num)));




  
  }
}