/* Lesson 5 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Two{
  public static void main(String[] args){
  
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Type a radius:");
    double rad = scan.nextDouble();
    System.out.println("Type a length:");
    double length =  scan.nextDouble();
    System.out.println("Type a width:");
    double width =  scan.nextDouble();
    
    Circle cir = new Circle (rad);
    Rectangle rectang = new Rectangle(length,width);
    
    System.out.println(cir);
    System.out.println(rectang);
    
    
    
    
  
  }
}