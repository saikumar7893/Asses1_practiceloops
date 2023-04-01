import java.util.*;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Even or Odd Checker");
            System.out.print("Enter the number ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.printf("The given number  is an EVEN Number", n);
            } else {
                System.out.printf("The given number  is a ODD Number", n);
            }

            System.out.print("Do u want to continue (y/n)");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

       
    }
}