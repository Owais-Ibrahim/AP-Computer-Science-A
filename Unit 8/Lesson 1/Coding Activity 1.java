public class U8_L1_Activity_One
{

  // Write your diagSum method as described in the assignment
  public static int diagSum(int [][] nums){
    int sums = 0;
    for(int i =0; i<nums.length; i++){
      //itterate row
      for(int j = i; j<nums[0].length; j++){
        //itterate columns
        sums+=nums[i][j];
        break;
      }
    }
    return sums;
  }
}
