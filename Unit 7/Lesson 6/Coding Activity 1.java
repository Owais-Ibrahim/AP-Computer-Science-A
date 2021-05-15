
import java.util.Arrays;

public class U7_L6_Activity_One
{

  //Write the sortAndPrint method described in the assignment

  public static void sortAndPrint(String [] arr) {
    for (int j = 1; j< arr.length; j++) { 
      String x= arr[j];
      int i = j - 1;
      while (i >= 0) {//Compare all previous to J
        if (x.compareTo(arr[i]) > 0) {
          break;
        }
        //if less than change
        arr[i + 1] = arr[i];
        i--;
      }
      arr[i + 1] = x;
      for(int b=0; b<arr.length;b++){
        System.out.print(arr[b] + " ");
      }
      System.out.println("");
      
  }
  
    
  }
}