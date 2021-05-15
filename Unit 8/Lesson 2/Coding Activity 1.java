public class TemperatureMonth{

  private double[][] temperatures;

  public TemperatureMonth(double[][] t){
    temperatures = t;
  }

  public double getMaxTemp(){
    // Remove return and implement getMaxTemp method here
    double max = temperatures[0][0];
    for(int i =0; i<temperatures.length; i++){
      for (int j = 0; j<temperatures[i].length;j++){
        if(temperatures[i][j] > max){
          max = temperatures[i][j];
        }
      }
    }
    return max;
  }

  public double getMinTemp(){
    // Remove return and implement getMinTemp method here
    double min = temperatures[0][0];
    for(int i =0; i<temperatures.length; i++){
      for (int j = 0; j<temperatures[i].length;j++){
        if(temperatures[i][j] < min){
          min = temperatures[i][j];
        }
      }
    }
    return min;
  }

  public double getMonthlyAverage(){
    // Remove return and implement getMonthlyAverage method here
    double avg = 0;
    double sum = 0;
    for(int i =0; i<temperatures.length; i++){
      for (int j = 0; j<temperatures[i].length;j++){
        sum += temperatures[i][j];
      }
    }
    int row = temperatures.length;
    int col = temperatures[0].length;
    avg = sum/(row*col);
    return avg;
  }

  public double[] getWeeklyAverages(){
    // Remove return and implement getWeeklyAverages method here
    double[] avg = new double [temperatures.length];
    double sum  = 0;
    for(int i =0; i<temperatures.length; i++){
      for (int j = 0; j<temperatures[i].length;j++){
        sum += temperatures[i][j];
      }
      avg[i] = sum/temperatures[i].length;
      sum = 0; 
    }
    return avg;
  }

}
