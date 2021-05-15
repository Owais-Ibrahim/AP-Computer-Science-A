public class U10_L1_Activity_One
{

  public static void printSameEnd(int n)
  {
    
    if(n>=10){
      printSameEnd(n-10);
    }
    if (n != 0)
    {
      System.out.print(n + " ");
    }
  }

}
