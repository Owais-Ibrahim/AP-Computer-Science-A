class Captain extends UltimatePlayer{
    private boolean type;
    
    Captain(String firstName, String lastName, String position, boolean type){
      super(firstName,lastName,position);
      this.type = type;
    }
    public int throwDisc(int pow){
      if(pow<1)
        pow = 1;
      else if(pow>10)
        pow = 10;
        
      return (pow*5);
    }
    public String toString(){
      if(type ==true)
         return super.toString() +  "\n   Captain: offense\n";
      else if(type==false)
         return super.toString() +  "\n   Captain: defense\n";
       
       return "";
    }
  }