// Don't forget, you will need to import the ArrayList class to implement the UltimateTeam class
import java.util.ArrayList;

class UltimateTeam{
  private ArrayList<UltimatePlayer> players;
  private ArrayList<Coach> coaches;
  
  UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
    this.players = players;
    this.coaches = coaches;
  }
  
  public String getCutters(){
    String output = "";  
    for(UltimatePlayer a: this.players){
      if(a.getPosition().equals("cutter"))
        output += a.toString() + "\n";
    }
    return output;
  }
  public String getHandlers(){
    String output = "";
    for(UltimatePlayer a: this.players){
      if(a.getPosition().equals("handler"))
        output += a.toString() + "\n";
    }
    return output;
  }
  public String toString(){
    String output = "COACHES\n";
    for (Coach a: coaches){
      output += a.toString() + "\n";
    }
    output += "\nPLAYERS\n";
    for(UltimatePlayer a: players){
      output += a.toString() + "\n";
    }
    return output;
  }
}