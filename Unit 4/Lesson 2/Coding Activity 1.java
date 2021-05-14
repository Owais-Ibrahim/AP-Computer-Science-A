/* Lesson 2 Coding Activity Question 1 */

import java.util.Scanner;

public class U4_L2_Activity_One{
  public static void main(String[] args){
    
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter two numbers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int even_num = 0;
    int c =0;
    boolean firsteven_input = false;
    boolean secondeven_input =false;
    
    //Checking if num1 is even
    if (num1%2==0)
      {
        even_num=num1;
        System.out.print(even_num + " ");
        firsteven_input = true;
      }
      //Chcecking if num2 is even
    if (num2%2==0)
      {
        secondeven_input=true;
      }
    
    while (num1<num2)
    {
      //Both even
      if(firsteven_input&&secondeven_input)
      {
        num1+=2;
        even_num=num1;
        System.out.print(even_num + " "); 
      }
      //First even 
      else if (firsteven_input && !secondeven_input)
      {
        if (num2-num1>1)
        {
          num1+=2;
          even_num=num1;
          System.out.print(even_num + " "); 
        }
        else
        {
          num1++;
        }
        
      }
      //Second even
      else if (!firsteven_input && secondeven_input)
      {
        if (c==0)
        {
          num1++;
          even_num=num1;
          System.out.print(even_num + " ");
          c++;
        }
          num1+=2;
          even_num=num1;
          System.out.print(even_num + " ");
      }
      
      //None even
      
      else if (!firsteven_input && !secondeven_input)
      {
        if (c==0)
        {
          num1++;
          even_num=num1;
          System.out.print(even_num + " ");
          c++;
        }
         if (num2-num1>1)
        {
          num1+=2;
          even_num=num1;
          System.out.print(even_num + " "); 
        }
        else
        {
          num1++;
        }
        
      }
      
  
    }
    
    
  }
}