public class RightTriangle
{
  private double area;
  private double hypotnuse;
  private double perimeter;
  private double base;
  private double height;
  private boolean equals;

  
  
  public RightTriangle()
  {
    this(1,1);
  }
  public RightTriangle (double bs, double ht)
  {
    if ((bs>0) && (ht>0))
    {
      base = bs;
      height = ht;
    }
    else
    {
      base = 1;
      height = 1;
    }
  }
  
  public void setBase (double bs)
  {
    if (bs>0)
    {
      base = bs;
    }
  }
  
  public void setHeight (double ht)
  {
    if (ht>0)
    {
      height = ht;
    }
  }
  
  public double getBase ()
  {
    return base;
  }
  
  public double getHeight()
  {
    return height;
  }
  
  public double getHypotenuse ()
  {
    return (Math.sqrt((Math.pow(base,2)+Math.pow(height,2))));
  }
  public double getArea()
  {
    return ((base * height)/2);
  }
  
  public double getPerimeter()
  {
    return (height + base + getHypotenuse());
  }
  
  public boolean equals (RightTriangle other)
  {
    if((other.getBase() == base) && (other.getHeight() == height))
    {
      equals = true;
    }
    else 
    {
      equals = false; 
    }
    return equals;
  }
  
  public String toString ()
  {
    return ("right triangle with base " + base + ", height "+ height + ", hypotnuse " + hypotnuse );
  }
  
  
  
  
}