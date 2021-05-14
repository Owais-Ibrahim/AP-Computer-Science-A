/* Lesson 4 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U5_L4_Activity_One{

  /* Add the method areaSum here */
  
  public static double areaSum(Circle x, Circle y)
  {
    double sum = 0;
    sum = (x.getArea()+y.getArea());
    return sum;
  }

  // You can uncomment and add to the main method to test your code
  // You will need to remove/comment out this method before checking your code for a score
  /*
  public static void main(String[] args){
    
  }
  */
}
