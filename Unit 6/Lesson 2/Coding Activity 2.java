public class U6_L2_Activity_Two{

  // Write your numEven method here
  
  public static int numEven(int nums[])
  {
    int counteven = 0;
    for (int i=0; i<nums.length; i++)
    {
     if(nums[i] % 2 == 0)
     {
       counteven++;
     }
    }
    return counteven;
  }

}
