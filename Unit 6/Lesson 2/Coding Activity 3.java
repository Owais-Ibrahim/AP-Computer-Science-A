public class U6_L2_Activity_Three{

  // Write your hasDuplicates method here

public static boolean hasDuplicates (int nums[])
{
  boolean duplicates = false; 
  for (int i=0; i<nums.length; i++)
  {
      for (int j= (i+1); j<nums.length; j++ )
    {
      if (nums[i] == nums[j])
      {
        duplicates = true;
        break;
      }
    }
  }
  return duplicates; 
}

}
