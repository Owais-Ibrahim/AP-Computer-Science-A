public class U6_L3_Activity_Two{

    public static void reverse(String[] words)
    {
      //Implement code to print each string from words backwards on a new line
      //String hey = "helloworld";
      String reverse = "";
      
      for (int i = 0; i<words.length; i++)
      {
        //System.out.println(words[i]);
        for (int j = (words[i].length()); j>0; j--)
        {
          //System.out.println(j);
          reverse = reverse + (words[i].substring(j-1,j));
        }
        System.out.println(reverse);
        reverse = "";
      }
      //System.out.println(hey.substring(9,8));
    }
  
  }
  