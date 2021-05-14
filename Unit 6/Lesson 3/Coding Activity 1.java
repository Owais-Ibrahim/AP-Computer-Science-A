public class U6_L3_Activity_One{

  public static String findLongest(String[] words)
  {
    String longword = "";
    int length = words[0].length();
   
    for (int i = 0; i<words.length; i++)
    { //itterate each word
      if ((words[i].length()>length))
      {
        length = words[i].length();
        longword = words[i];
      }
    }
    return longword;
  }

}
/*
high
every
nearing
checking
food
stand
value
best
energy
add
grand
notation
abducted
food
stand
*/