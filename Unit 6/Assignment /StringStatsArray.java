public class StringStatsArray{

    //Add a final private variable to hold String array
    final private String[] hold;
  
    public StringStatsArray(String[] a){
      //Write constructor code
      hold = a; 
    }
  
    //Implement all methods as described
    public String toString(){
      String toString = "{";
      int counter =0;
      for (String e:hold){
        counter++;
        toString += ("\"")+e+("\"");
        if(counter==hold.length){
        }
        else
          toString+=", ";
      }
      toString += "}";
      return toString;
    }
  
    public double averageLength(){
      double sum =0;
      for (String e:hold){
        sum+=e.length();
      }
      sum = sum/hold.length;
      
      return sum;
    }
  
    public int search(String target){
      for(int i=0; i<hold.length; i++){
        if(target.equals(hold[i])){
          return i;
        }
      }
      return -1;
    }
  
    public int sortStatus() {
      boolean ascending = true;
      boolean descending = true;
      
      for (int i = 1; i < hold.length; i++) {
      if (hold[i].compareTo(hold[i - 1])<0) {
          ascending = false;
          break;
        }
      }
          
      for (int i = 1; i < hold.length; i++) {
      if (hold[i].compareTo(hold[i - 1])>0) {
          descending = false;
          break;
        }
      }
      
      if(ascending == true)
      return 1;
      
      else if(descending == true)
      return -1;
      
      else
      return 0;
     
    }
  
  }
  