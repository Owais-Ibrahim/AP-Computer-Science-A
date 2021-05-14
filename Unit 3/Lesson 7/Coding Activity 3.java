/* Lesson 7 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U3_L7_Activity_Three{
  public static void main(String[] args){

    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter length:");
    double length = scan.nextDouble();
    Rectangle rect1 = new Rectangle (length);
    System.out.println("Enter 2 lengths:");
    double length1 = scan.nextDouble();
    double length2 = scan.nextDouble();
    Rectangle rect2 = new Rectangle (length1,length2);
    
    if (rect1.equals(rect2))
    {
      System.out.println("Congruent Rectangles");
    }
    else
    {
      System.out.println("Different Rectangles");
    }
    
    
  }
}
