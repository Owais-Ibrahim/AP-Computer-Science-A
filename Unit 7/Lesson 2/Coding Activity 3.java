import java.util.ArrayList;

public class U7_L2_Activity_Three{

  public static ArrayList<Integer> getOdds(ArrayList<Integer> vals){
      // Implement this method as described in the assignment
      ArrayList<Integer> nums = new ArrayList<Integer>();
      for (int i =0; i<vals.size(); i++){
        if(vals.get(i)%2!=0){
          nums.add(vals.get(i));
        }
      }
      return(nums);
  }

}
