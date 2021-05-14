public class Fraction
{
  private int numerator; 
  private int denominator; 
  private int mixedNumber;
  private static int numFractions;
  
  public Fraction()
  {
    this(1,1);
  }
  public Fraction(int n, int d)
  {
    if (n>0)
    {
      numerator = n;
    }
    else
    {
      numerator = 1;
    }
    
    if (d>0)
    {
      denominator = d;
    }
    else
    {
      denominator = 1;
    }
    numFractions++;
  }
  
  public int getNumerator()
  {
    return numerator;
  }
  public int getDenominator()
  {
    return denominator; 
  }
  public static int getNumFractions()
  {
    return numFractions;
  }
  
  public String toString()
  {
    return (numerator + "/"+ denominator);
  }
  public String mixedNumber()
  {
    if((numerator/denominator)>=1)
    {
      mixedNumber = numerator/denominator;
    }
    return (mixedNumber + " " + (numerator%denominator) +"/"+ denominator);
  }
  
  public void setNumerator(int n)
  {
    if (n>0)
    {
      numerator = n;
    }
  }
  public void setDenominator(int d)
  {
    if (d>0)
    {
      denominator = d;
    }
  }
  public void add(int n, int d)
  {
    if((n>0)&&(d>0))
    {
     numerator = ((numerator * d) +( denominator * n));
     denominator = (denominator*d);
    }
  }
  public void add (Fraction other)
  {
    if((other.getNumerator()>0)&&(other.getDenominator()>0))
    {
       numerator =  ((numerator * other.getDenominator()) +( denominator * other.getNumerator()));
       denominator = (denominator*other.getDenominator());
    }
  }
  public void multiply (int n, int d)
  {
    if((n>0)&&(d>0))
    {
     numerator = (numerator * n);
     denominator = (denominator * d);
    }
  }
  
  public void multiply (Fraction other)
  {
    if(((other.getNumerator())>0)&&((other.getDenominator())>0))
    {
     numerator = (numerator * other.getNumerator());
     denominator = (denominator * other.getDenominator());
    }
  }
  
  
  
}

