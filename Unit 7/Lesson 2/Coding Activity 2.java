import java.util.ArrayList;

public class U7_L2_Activity_Two{

  public static double average (ArrayList<Double> nums){
    double sum = 0;
    for (Double i:nums){
      sum += i;
    }
    return((double)(sum/(nums.size())));
  }

}
