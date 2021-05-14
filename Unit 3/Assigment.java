import java.util.Scanner;

public class Assignment3 {

  public static void main (String args[]) {
    Scanner scan = new Scanner (System.in);

    System.out.println("Welcome. What is your name?");
    String name = scan.nextLine();
    System.out.println("Hello " + name + ". Are you ready to crack the code?");
    String response = scan.nextLine();
    response = response.toLowerCase();
    
    
    if (response.equals("yes"))
    {
      System.out.println("PHASE 1");
      System.out.println("Enter a number:");
      int num1 = scan.nextInt();
      if (num1 == 3)
      {
        System.out.println("Correct!");
        
        System.out.println("PHASE 2");
        System.out.println("Enter a number:");
        int num2 = scan.nextInt();        
        if(num2 == 1 || (33<=num2 && num2<=100))
        {
          System.out.println("Correct!");
          
          System.out.println("PHASE 3");
          System.out.println("Enter a number:");
          int num3 = scan.nextInt();    
          
            if (num3>0 && (num3%3==0 || num3%7==0))
            {
              System.out.println("Correct!");
              System.out.println("You have cracked the code!");
            }
        //Phase 3 failure
            else
            {
             System.out.println("Sorry, that was incorrect!");
             System.out.println("Better luck next time!");
            }
          
        }
        //if phase two fails
          else
          {
            System.out.println("Sorry, that was incorrect!");
            System.out.println("Better luck next time!");          
          }
        }
     
      //Phase 1 failure
      else
      {
        System.out.println("Sorry, that was incorrect!");
        System.out.println("Better luck next time!"); 
      }
    }
    //Failure of yes
    else 
    {
      
    }
  }
}
