/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U2_L3_Activity_Three{
  public static void main(String[] args){
  
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter first word:");
    String firstword = scan.nextLine();
    System.out.println("Enter second word:");
    String secondword = scan.nextLine();
    firstword=firstword.toLowerCase();
    secondword=secondword.toLowerCase();
    int comp = firstword.compareTo(secondword);
    
    System.out.println("Result: "+comp);


  }
}