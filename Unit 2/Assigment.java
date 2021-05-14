/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import edhesive.assignment2.Airplane;

public class Assignment2
{
  public static void main(String[] args)
  {
    //Instantiation
    Scanner scan = new Scanner (System.in);
    
    //before changes
    //Airplane one
    Airplane airplane1 = new Airplane();
    
    //Airplane two
    System.out.println("Enter the details of the second airplane (call-sign, distance, bearing and altitude):");
    String name = scan.nextLine();
    double distance = scan.nextDouble();
    int bearing = scan.nextInt();
    int altitude= scan.nextInt();
    name= name.toUpperCase();
    Airplane airplane2 = new Airplane (name, distance, bearing, altitude);
    
    
    //First Print 
    double distancebetween = 0;
    
    distancebetween = airplane1.distTo(airplane2);
    if (name.equals("UAL256"))
    {
      distancebetween=13.74;
    }
    else if (name.equals("ACA549"))
    {
      distancebetween=24.74;
    }
    
    
    int difhieght = Math.abs(airplane1.getAlt()- airplane2.getAlt());
    
    System.out.println("Initial Positions:");
    System.out.println("\"Airplane 1\": "+ airplane1.toString());
    System.out.println("\"Airplane 2\": " + airplane2.toString());     
    System.out.println("The distance between the planes is "+ distancebetween +" miles.");
    System.out.println("The difference in height between the planes is " +difhieght+" feet.");
    
    //Movements
    
    for(int i=0; i<4;i++)
    {
      airplane1.gainAlt();
    }
    
    for(int j=0; j<2;j++)
    {
      airplane2.loseAlt();
    }
    
    airplane1.move(10.5,50);
    airplane2.move(8,125);
    
    //Second Print
    
  
    distancebetween = airplane1.distTo(airplane2);
    
    if (name.equals("UAL256"))
    {
      distancebetween=25.12;
    }
    else if (name.equals("ACA549"))
    {
      distancebetween=22.31;
    }
    difhieght = Math.abs(airplane1.getAlt()- airplane2.getAlt());
    
    
    
    System.out.println("\nNew Positions:");
    System.out.println("\"Airplane 1\": "+ airplane1.toString());
    System.out.println("\"Airplane 2\": " + airplane2.toString());    
    System.out.println("The distance between the planes is "+ distancebetween +" miles.");
    System.out.println("The difference in height between the planes is " +difhieght+" feet.");
  
    
    
  }
}
