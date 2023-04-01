import java.util.*;
public class Substring{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.next();
      System.out.println("Engter the Start and End Index");
      int Start=sc.nextInt();
      int End=sc.nextInt();
      System.out.println("Substring is "+s.substring(Start,End));
      
}
}