/* Lesson 6 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_Two{
  public static void main(String[] args){
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter radius:");
    double radi = scan.nextDouble();
    
    Circle cir = new Circle(radi);
    
    double area = cir.getArea();
    
    System.out.println("Area: "+ area);
    System.out.println("Radius is being doubled...");
    cir.setRadius(cir.getRadius()*2);
    area=cir.getArea();
    System.out.println("Area: "+ area);



  }
}