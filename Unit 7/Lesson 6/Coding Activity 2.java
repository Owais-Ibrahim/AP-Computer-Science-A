import java.util.ArrayList;

public class U7_L6_Activity_Two
{

  // Write your insertSort method as described in the assignment
  public static int insertSort(ArrayList<Integer> list) {
    int count = 0;
    int j;
    for (int i = 1; i< list.size(); i++)
    {
      Integer x = list.get(i);
      for (j = i - 1; j >= 0; j--)
      {
        count++;
        if (list.get(j) > x)
        {
          list.set(j + 1, list.get(j));
        }
        else
        {
          break;
        }
      }
      list.set(j+1, x);
    }
    return count;
  }
}
