/* Lesson 3 Coding Activity Question 4 */

import java.util.Scanner;

public class U2_L3_Activity_Four{
  public static void main(String[] args){
  
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a sentence:");
    String sentence = scan.nextLine();
    int spaceindex = sentence.indexOf(" ");
    String firstword = sentence.substring(0,spaceindex);
    int length = firstword.length();
    System.out.println(length);
  }
}