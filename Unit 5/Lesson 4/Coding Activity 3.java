/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;
import java.lang.Math; 

public class U5_L4_Activity_Three{

  /* Add the method areaDiff here */
  
  public static double areaDiff(Rectangle x, Rectangle y)
  {
    double diff = 0;
    diff = ((x.getArea()) - (y.getArea())) ;
    diff = Math.abs(diff);
    return diff;
  }

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    
  }
  */
}
