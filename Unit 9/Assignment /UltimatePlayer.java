class UltimatePlayer extends Person{
    private static int c = 0;
    private int jerseyNumber;
    private String position;
    
    UltimatePlayer(String firstName, String lastName, String position){
      super(firstName,lastName);
      if(position.equals("cutter")||position.equals("handler") )
        this.position = position;
      else
        this.position = "handler";
        
      this.c++;
      this.jerseyNumber = c;
    }
    public String getPosition(){
      return position;
    }
    public int throwDisc(int pow){
      if (pow<1)
        pow = 1;
      else if (pow>10)
        pow = 10;
      
      return (pow*4);
    }
    public String toString(){
      return super.toString() + ("\n   Jersey #: " + jerseyNumber) + "\n   Position: " + position;
    }
  }