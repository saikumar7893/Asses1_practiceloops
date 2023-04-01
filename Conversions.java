import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nMenu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");

            System.out.print("\nEnter your menu - ");
            int value = sc.nextInt();
            switch (value) {
                case 1:
                    System.out.print("Please enter the CM Value: ");
                    int cm = sc.nextInt();
                    double m = cm / 100.0;
                    System.out.printf("%d CM = %.2f M\n", cm, m);
                    break;
                case 2:
                    System.out.print("Please enter the M Value: ");
                    double m1= sc.nextDouble();
                    double km1 = m1 / 1000.0;
                    System.out.printf("%.2f M = %.2f KM\n", m1, km1);
                    break;
                case 3:
                    System.out.print("Please enter the KM Value: ");
                    double km2 = sc.nextDouble();
                    double m2 = km2 * 1000.0;
                    System.out.printf("%.2f KM = %.2f M\n", km2, m2);
                    break;
                case 4:
                    System.out.print("Please enter the M Value: ");
                    double m3 = sc.nextDouble();
                    double cm3 = m3 * 100.0;
                    System.out.printf("%.2f M = %.2f CM\n", m3, cm3);
                    break;
                default:
                    System.out.println("Invalid menu selected");
                    break;
            }

            System.out.print("\nDo you want to Continue (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        
    }
}

