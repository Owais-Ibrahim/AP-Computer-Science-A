import java.util.ArrayList;

public class U7_L3_Activity_Two
{

  // Write the printStatistics method as described in the assignment
  public static void printStatistics(ArrayList<Integer> objects){
    double sum =0;
    double avg = 0;
    int mod =0;
    int c = 0;
    int hold = 0;
    boolean multiple = false;
    for (int i =0; i<objects.size();i++){
      sum+=objects.get(i);
      for(int j = i; j<objects.size(); j++){
        if(objects.get(i)==objects.get(j)){
          c++;
        }
      }
      if(c>hold){
        hold = c;
        mod =objects.get(i);
      }
      else if(c==hold){
         multiple = true;
      }
      c=0;
      
    }
    avg =(double)(sum/objects.size());
    int z = (int) (sum);
    System.out.println("Sum: "+ z) ;
    System.out.println("Average: "+ avg);
    if(multiple)
      System.out.println("Mode: "+ "no single mode");
    else
      System.out.println("Mode: "+ mod);
  }
}
