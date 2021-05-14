public class U6_L4_Activity_One{

  public static boolean insert(String[] words, String newWord, int place) 
  {
     if (place > words.length-1 || place<0){
         return false;
       } 
     else {
       for (int x = words.length - 1; x >= 0; x--) {
           if (place == x) {
               words[x] = newWord;
               break;
           } 
           else {
               words[x] = words[x-1];
           }
       }
       return true;
    }
  }
}
