/* Lesson 2 Coding Activity Question 3 */
import java.util.Scanner;
public class U4_L2_Activity_Three{
public static void main(String[] args)
{
  Scanner scan = new Scanner (System.in);
  
  double longitude = 0;
  double latitude = 0;
  int response = 1;
  
  // max and min values for lon and lat
  double far_north = -90;
  double far_south = 90;
  double far_east = -180;
  double far_west = 180;
  
  while(response == 1)
  {
    System.out.println("Please enter the longitude:");
    longitude = scan.nextDouble();
    System.out.println("Please enter the latitude:");
    latitude = scan.nextDouble();
    
      if (!(longitude>=-180 && longitude<=180) || !(latitude>=-90 && latitude<=90))
      {
      System.out.println("Incorrect Latitude or Longitude");
      }
    
      else
      {
          if (latitude > far_north){
            far_north = latitude;
          }
          if (latitude < far_south){
          far_south = latitude;
          }
          if (longitude>far_east){
          far_east = longitude;
          }
          if (longitude < far_west){
          far_west = longitude;
          }
      }
    
    System.out.println("Would you like to enter another location (1 for yes, 0 for no)?");
    response = scan.nextInt();
  }
  System.out.println("Farthest North: "+far_north);
  System.out.println("Farthest South: "+far_south);
  System.out.println("Farthest East: "+ far_east );
  System.out.println("Farthest West: "+far_west);
    }
  }