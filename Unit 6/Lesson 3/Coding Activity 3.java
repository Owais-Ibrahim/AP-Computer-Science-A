public class U6_L3_Activity_Three{

  // Write your printIngs method here
  
  public static void printIngs(String words[])
  {
    String ending = "";
    for (int i =0; i<words.length; i++)
    {
      if (words[i].length()>3)
      {
        ending =words[i].substring((words[i].length()-3),words[i].length());
        if(ending.equals("ing"))
        {
          System.out.println(words[i]);
        }
      }
    }
  }

}
