/* Lesson 8 Coding Activity Question 2 */

import java.util.Scanner;

public class U2_L8_Activity_Two{
  public static void main(String[] args){
  
   Scanner scan = new Scanner (System.in);
  
   System.out.println("Enter distance east:");
   double east = scan.nextDouble();
   System.out.println("Enter distance north:"); 
   double north = scan.nextDouble();
   double distance = Math.sqrt((Math.pow(east,2)+Math.pow(north,2)));
   System.out.println("Distance between points: "+ distance); 
    
  }
}