import java.util.*;
public class Asterisk {
    public static void main(String[] args) {
        int n = 5; // set n as 5 for the first half of the pattern

        // print the first half of the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // print the second half of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}