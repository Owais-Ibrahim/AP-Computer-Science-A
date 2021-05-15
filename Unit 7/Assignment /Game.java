import java.util.ArrayList;

public class Game
{
  public static void play(GameWheel g)
  {
    // Implement the play method here
    
    String first = g.spinWheel().toString();
    String second = g.spinWheel().toString();
    String third = g.spinWheel().toString();
    int amount = 0;
    String color1 = "";
    String color2 = "";
    String color3 = "";
    int start=0;
    int end = 0;
    
    for(int i =0; i<first.length(); i++){
      if(first.charAt(i)==' '){
        start = i+1;
      }
      if(first.charAt(i)==','){
        end = i;
        color1 = first.substring(start,end);
      }
      
    }
    for(int i =0; i<second.length(); i++){
      if(second.charAt(i)==' '){
        start = i+1;
      }
      if(second.charAt(i)==','){
        end = i;
        color2 = second.substring(start,end);
      }
      
    }
    for(int i =0; i<third.length(); i++){
      if(third.charAt(i)==' '){
        start = i+1;
      }
      if(third.charAt(i)==','){
        end = i;
        color3 = third.substring(start,end);
      }
      
    }
    
    for (int i = first.length()-1; i>=0; i--){
      if(first.charAt(i)=='$'){
         amount += Integer.valueOf(first.substring(i+1,first.length()));
        break;
      }
    }
    for (int i = second.length()-1; i>=0; i--){
      if(second.charAt(i)=='$'){
         amount += Integer.valueOf(second.substring(i+1,second.length()));
        break;
      }
    }
    for (int i = third.length()-1; i>=0; i--){
      if(third.charAt(i)=='$'){
         amount += Integer.valueOf(third.substring(i+1,third.length()));
        break;
      }
    }
    boolean doubled = false;
    if(color1.equals(color2)&&color2.equals(color3)){
      amount *=2;
      doubled = true;
    }
      
      
    System.out.println("Total prize money: $"+amount + "\n");
    System.out.println("Spin 1 - "+first);
    System.out.println("Spin 2 - "+second);
    System.out.println("Spin 3 - "+third);
    if(doubled)
      System.out.println("Three "+color1+"s = double your money!");
    
    
  }
}
