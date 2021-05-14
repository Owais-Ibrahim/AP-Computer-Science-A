public class U6_L2_Activity_One{

  // Write your allNegative method here
  
  public static boolean allNegative (double nums[])
  {
    boolean negative = false; 
    for (int i=0; i<nums.length; i++)
    {
      if(nums[i] < 0)
      {
        negative = true;
      }
      else if (nums[i] >= 0)
      {
        negative = false;
        break;
      }
    }
    return negative;
  }

}
