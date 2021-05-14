public class Student 
{
  private String FirstName;
  private String LastName;
  private int GradeLevel;
  private double GPA; 
  private static int studentID = 0;
  
  public Student()
  {
    FirstName = "None";
    LastName = "None";
    GradeLevel = 0;
    GPA = 0.0; 
    studentID++;
    
  }
  
  public Student(String firstName, String lastName, int gradeLevel, double gpa)
  {
    studentID++;
    
    FirstName = firstName; 
    LastName = lastName; 
    
    if ((gradeLevel>=0) && (gradeLevel <=12))
    {
      GradeLevel = gradeLevel;
    }
    else
    {
      GradeLevel = 0;
    }

    if ((gpa>=0) && (gpa<=4.5))
    {
      GPA = gpa;
    }
    else 
    {
      GPA = 0.0;
    }
    
  }
  
  public String toString()
  {
    return(LastName + ", " + FirstName+ "\nGPA: " + GPA + "\nGrade Level: " + GradeLevel + " id # "+ studentID );
  }
  
}