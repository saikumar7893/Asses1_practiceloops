import java.util.*;
class Grade
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
     
      System.out.println("enter the marks obtained by the student");
      float marks=sc.nextFloat();
      System.out.println("enter the total Marks");
      float total=sc.nextFloat();
      float percent=marks*100/total;
      System.out.println(percent);
      if(percent>0 && percent<=59)
      {
      System.out.println("Grade is F");
      System.out.println("GPA is 0.0");
      }
      else if(percent>60 && percent<=69)
      {
      System.out.println("Grade is D");
      System.out.println("GPA is 1.0"); 
      }
       else if(percent>70 && percent<=79)
       {
      System.out.println("Grade is C");
      System.out.println("GPA is 2.0"); 
       }
       else if(percent>80 && percent<=89)
       {
      System.out.println("Grade is B");
      System.out.println("GPA is 3.0"); 
       }
      else
      {
      System.out.println("Grade is A");
      System.out.println("GPA is 4.0"); 
      }
      
    }
}