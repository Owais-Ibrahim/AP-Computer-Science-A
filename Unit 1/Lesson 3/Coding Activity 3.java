/* Lesson 3 Coding Activity Question 3 */

import java.util.Scanner;

public class U1_L3_Activity_Three{
  public static void main(String[] args){
    //Scanner
   Scanner scan = new Scanner (System.in);
   
   //Questions & Ans
   System.out.println("Java is a programming language, true or false?");
   Boolean ans1=scan.nextBoolean();
   System.out.println("Only numbers can be stored by variables in Java, true or false?");
      Boolean ans2=scan.nextBoolean();
   System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
      Boolean ans3=scan.nextBoolean();
   
   
   //Results
   System.out.println("Question 1 - Your answer: "+ans1+". Correct answer: true");
   System.out.println("Question 2 - Your answer: "+ans2+". Correct answer: false");
   System.out.println("Question 3 - Your answer: "+ans3+". Correct answer: true");
   
   
    
  }
}