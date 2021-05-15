public class U8_L1_Activity_Two
{

  // Write your multTable method as described in the assignment
  public static int[][] multTable(int rows, int columns){
    int[][] nums = new int [rows][columns];
    int mult = 1;
    int counter =1;
    for(int i =0; i<nums.length; i++){
      if(i!=0){
        int hold = 0;
        for (int j = 0; j<nums[0].length; j++){
          if(j!=0){
            hold += i;
            nums[i][j] = hold;
          }
        }
      }
    }
    return nums;
  }
}
