package Lab_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_1 {

    public static void main(String[] args) {
        final byte C = 2;
        byte i, j, a, b, n, m;
        int floor;
        double res = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a:");
                a = scanner.nextByte();
                System.out.println("Enter b:");
                b = scanner.nextByte();
                System.out.println("Enter n:");
                n = scanner.nextByte();
                System.out.println("Enter m:");
                m = scanner.nextByte();
                if (a > n || b > m) {
                    System.out.println("a and b can't be bigger than n and m respectively");
                    continue;
                }
                if ((a <= C && n >= C) || (b <= 0 && m >= 0)) {
                    System.out.println("the denominator can't be zero");
                    continue;
                }
                break;
            } catch (InputMismatchException exc) {
                System.out.println("Invalid number type. Try again.");
                scanner.next();
            }
        }
        for (i = a; i <= n; i++) {
            floor = i - C;
            for (j = b; j <= m; j++) {
                res += ((double) i / j) / floor;
            }
        }
        System.out.println("Result is:" + res);
    }
}