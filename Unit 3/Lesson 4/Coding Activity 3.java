/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U3_L4_Activity_Three{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please enter the first octet:");
    int num1 = scan.nextInt();
    boolean num1bool = false;
    if (num1>=0&&num1<=255)
    {
       num1bool = true;
    }
    
    System.out.println("Please enter the second octet:");
    int num2 = scan.nextInt();
    boolean num2bool = false;
    if (num2>=0&&num2<=255)
    {
       num2bool = true;
    }
    
    System.out.println("Please enter the third octet:");
    int num3 = scan.nextInt();
    boolean num3bool = false;
    if (num3>=0&&num3<=255)
    {
       num3bool = true;
    }
    
    System.out.println("Please enter the fourth octet:");
    int num4 = scan.nextInt();
    boolean num4bool = false;
    if (num4>=0&&num4<=255)
    {
       num4bool = true;
    }
    
  
    
    if (num1bool == false)
    {
      System.out.println("Octet 1 is incorrect");
    }
     if (num2bool == false)
    {
      System.out.println("Octet 2 is incorrect");
    }
     if (num3bool == false)
    {
      System.out.println("Octet 3 is incorrect");
    }
     if (num4bool == false)
    {
      System.out.println("Octet 4 is incorrect");
    }
    if (num1bool == true && num2bool == true && num3bool == true && num4bool== true)
    {
    System.out.println("IP Address: "+num1+"."+num2+"."+num3+"."+num4);   
    }
    
   
  
  }
}