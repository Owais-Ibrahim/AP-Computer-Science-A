public class Vehicle
{
  private int location; //may range from -20 to 20
  private String space = "";
  
  public Vehicle ()
  {
    this(0);
  }
  
  public Vehicle (int loc )
  {
    if ((loc>=-20) && (loc<=20))
    {
      location = loc;
    }
    else
    {
      location = 0;
    }
  }
  
  public void forward()
  {
    if ((location<20))
    {
      location++;
    }
  }
  
  public void backward()
  {
    if(location>-20)
    {
      location--;
    }
  }
  
  public int getLocation()
  {
    return location;
  }
  
  public String toString ()
  {
    for (int n = location; n>-20; n--)
    {
      space += " ";
    }
    return (space + "@");
  }
  
}
