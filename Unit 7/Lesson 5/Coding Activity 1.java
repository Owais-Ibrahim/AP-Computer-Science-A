public class U7_L5_Activity_One
{

  //Write the sortAndPrint method described in the assignment
  public static void sortAndPrint(String[] arr) {
    for(int i=0; i< arr.length-1; i++ ){
      int x = i;
      for(int j=i+1; j< arr.length; j++ ){
        if(arr[j].compareTo( arr[x])<0){
            x = j;  
        }
      }
      String hold = arr[i];
      arr[i] = arr[x];
      arr[x] = hold;
    }

    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }


}
    // for(String b : arr){
    //   System.out.println(b+" ");
    // }
  
