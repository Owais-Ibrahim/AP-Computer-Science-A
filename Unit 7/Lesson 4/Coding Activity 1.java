import java.util.ArrayList;

public class U7_L4_Activity_One{
  public static int countInitial(ArrayList<String> list, String letter){
    int i =0;
    // Implement the countInitial method as described in the assignment
    for (String s:list){
      if (Character.toUpperCase(s.charAt(0))==(Character.toUpperCase(letter.charAt(0)))){
        i++;
      }
    }
    return i;
  }
}
