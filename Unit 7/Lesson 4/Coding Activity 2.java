import java.util.ArrayList;

public class U7_L4_Activity_Two{

  // Write your searchLast method as described in the assignment
  public static int searchLast(ArrayList<String> words, String target){
    for(int i=words.size()-1; i>=0; i--){
      if(words.get(i).equals(target)){
        return i;
      }
    }
    return -1;
  }
  
}
