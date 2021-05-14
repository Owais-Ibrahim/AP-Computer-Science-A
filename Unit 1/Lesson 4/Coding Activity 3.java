/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

class U1_L4_Activity_Three {
  public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter a radius:");
int radius= scan.nextInt();
double circum= 2*(Math.PI)*radius;
double area= (Math.PI)*(Math.pow(radius,2));
  System.out.println("Circumference: "+circum);
System.out.println("Area: "+area);

  }
}
