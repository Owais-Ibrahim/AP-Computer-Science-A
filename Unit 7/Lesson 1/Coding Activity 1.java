import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One{

  public static void main(String[] args){
   Scanner scan = new Scanner (System.in);
   ArrayList<String> words = new ArrayList<String>();
   System.out.println("Please enter words, enter STOP to stop the loop.");
   String input = scan.nextLine();
   while(!input.equals("STOP")){
     words.add(input);
     input = scan.nextLine();
   }
   System.out.println(words.size());
   System.out.println(words);
   if(words.size()>2){
     words.remove(0);
     words.remove(words.size()-1);
   }
   System.out.println(words);

   
   
  }

}
