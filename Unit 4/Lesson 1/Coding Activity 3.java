/* Lesson 1 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L1_Activity_Three{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Input a word:");
    String in = scan.nextLine();
    int length = in.length();
    int index = 0;
    String out = "";
    
    while(index<length)
    {
      out += in.substring(index,index+1);
      index+=2;
    
    }
    System.out.println(out);

  }
}