import java.util.*;
class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a and b");
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping: a="+a+" "+"b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After  Swapping: a="+a+" "+"b="+b);
       
    }
}