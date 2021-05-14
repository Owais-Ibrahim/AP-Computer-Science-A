public class U6_L4_Activity_Two{

  // Write the methods swap and allSwap here
  public static void swap(int[]arr, int i, int j){
      int hold = arr[i];
      arr[i]=arr[j];
      arr[j]=hold;
    
  }
  public static void allSwap(int[]arr){
    
    for(int i=0; i<arr.length-1; i+=2){
      int hold = arr[i];
      arr[i] = arr[i+1];
      arr[i+1] = hold;
      
    }
     
  }

}

