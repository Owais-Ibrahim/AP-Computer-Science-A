public class Board{

  private String[][] squares = new String [10][10];

  public Board(){
    for(int i = 0; i<squares.length; i++){
      for (int j = 0; j<squares[0].length; j++){
        squares[i][j] = "-";
      }
    }
  }

  public String toString(){
    String board = "";
    for(int i = 0; i<squares.length; i++){
      for (int j = 0; j<squares[0].length; j++){
        board += squares[i][j] + " ";
      }
      board += "\n";
    }
    return board;
  }

  public boolean addShip(int row, int col, int len, boolean horizontal){
    //if any inputs are exceptions
    if (row < 0 || col < 0 || row >= squares.length || col >= squares[0].length) {
      return false;
    }
      
    //horizontal
    if(horizontal){
      //checking if it fits
      if(len + col > squares.length)
        return false;
      //is there other ship
      for (int j = col; j < col+len; j++) {
        if(!squares[row][j].equals("-")) 
          return false;
      }
          
      //if there is no ship and in grid we want to write
      for (int i = col; i<len+col; i++){
        squares[row][i] = "b";
      }
    }
    //vertical 
    else{
      //check if it fits
      if(len + row >squares.length)
        return false;
        
      //is there other ship
      for (int j = row; j < row+len; j++) {
        if(!squares[j][col].equals("-")) 
          return false;
      }
      //if none lets add
      for (int j = row; j < row+len; j++) {
        squares[j][col] = "b";
      }
    }
    
    return true;
  }
    

  public boolean foundShip(int len){
    int counter = 0;
    //horizontal patterns
    for(int i = 0; i<squares.length; i++){
      for (int j = 0; j<squares[0].length; j++){
        if(squares[i][j].equals("b")){
            counter++;
        }
      }
      if(counter == len){
        return true;
      }
      counter = 0;
    }
    
    //vertical patterns
    for(int col =0; col<squares[0].length; col++){
      for (int row = 0; row<squares.length; row++ ){
        if(squares[row][col].equals("b")){
          counter++;
        }
      }
      if(counter == len){
        return true;
      }
      counter=0;
    }
    return false;
  }

  public int shoot(int row, int col){
    if(row<0 || row>=squares.length || col<0 || col>=squares[0].length){
      return -1;
    }
    if(squares[row][col].equals("-")){
      squares[row][col] = "m";
      return 0;
    }
    if(squares[row][col].equals("b")){
      squares[row][col] = "x";
      return 1;
    }
    return 2;
  }

  public boolean gameOver(){
    for(int i = 0; i < squares.length; i++) {
      for(int j = 0; j < squares[0].length; j++) {
        if(squares[i][j].equals("b")) {
          return false;
        }
      }
    }    
    return true;
  }
}
