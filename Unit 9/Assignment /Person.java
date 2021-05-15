class Person{
  private String firstName;
  private String lastName;
  
  Person(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public int throwDisc(int pow){
    if(pow < 1)
      pow = 1;
    else if(pow>10)
      pow = 10;
      
    return (pow*2); 
  }
  public String toString(){
    return lastName + ", " + firstName;
  }
}