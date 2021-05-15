import java.util.ArrayList;

public class U7_L3_Activity_One
{
  // Write your shiftRight method here
  public static void shiftRight(ArrayList<String>objects){
    for (int i = objects.size() - 1; i > 0; i--) {
      objects.add(i, objects.remove(i - 1));
    }
  }

}
