/* Lesson 6 Coding Activity Question 1 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_One{
  public static void main(String[] args){
  
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter a number of sides:");
    int side = scan.nextInt();
    System.out.println("Enter side length:");
    double length = scan.nextDouble();
    
    RegularPolygon poly = new RegularPolygon (side,length);
 
    double perimeter = poly.getPerimeter();
    double area = poly.getArea();
    
    System.out.print("A "+poly+" has perimeter "+perimeter+" and area "+area) ;
  }
}