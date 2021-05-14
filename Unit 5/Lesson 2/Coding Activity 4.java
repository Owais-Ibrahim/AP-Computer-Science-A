/* Lesson 2 Coding Activity Question 4 */

import java.util.Scanner;

public class U5_L2_Activity_Four{

    public static void realTime (int x)
  {
    int remainder = 0;
    int hours = 0;
    
    hours = x/3600; 
    System.out.println("Hours: " + hours);
    remainder = x % 3600;
    
    int minutes = 0;
    minutes = remainder / 60;
    System.out.println("Minutes: " + minutes);
    
    int seconds = 0;
    seconds = remainder % 60;
    System.out.println("Seconds: " + seconds);

  }

  
}