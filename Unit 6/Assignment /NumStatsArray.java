public class NumStatsArray{

    //Add a final private variable to hold double array
    final private double [] hold;
  
    public NumStatsArray(double[] a){
      hold = a;
    }
  
    //Implement all methods as described
    public String toString(){
      String toString = "{";
      int counter =0;
      for (double e:hold){
        counter++;
        toString += (Double.toString(e));
        if(counter==hold.length){
        }
        else
          toString+=", ";
      }
      toString += "}";
      return toString;
    }
  
    public double average(){
      double sum =0;
      for (double e:hold){
        sum+=e;
      }
      sum = sum/hold.length;
      
      return sum;
    }
  
    public double range(){
      double max = 0;
      double min = 0;
      for( double e:hold){
        if(e>max){
          max=e;
        }
        else if(e<min){
          min=e;
        }
      }
    
      return max-min;
    }
  
    public int sortStatus() {
      boolean ascending = true;
      boolean descending = true;
      
      for (int i = 0; i < hold.length - 1; i++) {
      if (hold[i] > hold[i + 1]) {
          ascending = false;
          break;
        }
      }
          
      for (int i = 0; i < hold.length - 1; i++) {
      if (hold[i] < hold[i + 1]) {
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
  