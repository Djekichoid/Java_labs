package Lab_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, bigger_number;
        double temp, result = 0;
        while (true) {
            try {
                System.out.println("Enter quantity of row:");
                a = sc.nextInt();
                System.out.println("Enter quantity of column:");
                b = sc.nextInt();
                if (a < 0 || b < 0) {
                    System.out.println("Enter natural numbers");
                    continue;
                }
                bigger_number = a;
                break;
            } catch (InputMismatchException exc) {
                System.out.println("Enter natural numbers");
                sc.next();
            }
        }
        if (bigger_number < b) {
            bigger_number = b;
        }
        double[][] matrixA = new double[bigger_number][bigger_number];
        System.out.println("Enter numbers for matrix");
        while (true) {
            try {
                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < b; j++) {
                        System.out.print("A[" + Integer.toString(i) + "][" + Integer.toString(j) + "]");
                        matrixA[i][j] = sc.nextDouble();
                    }
                }
                break;
            } catch (InputMismatchException exc) {
                System.out.println("Enter number");
                sc.next();
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print("| ");
            for (int j = 0; j < b; j++) {
                System.out.print(matrixA[i][j] + " | ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < b; j++) {
                temp = matrixA[i][j];
                matrixA[i][j] = matrixA[j][i];
                matrixA[j][i] = temp;
            }
        }
        double[][] matrixC = new double[b][a];
        System.out.println("Matrix after transposition");
        for (int i = 0; i < b; i++) {
            System.out.print("| ");
            for (int j = 0; j < a; j++) {
                matrixC[i][j] = matrixA[i][j];
                System.out.print(Double.toString(matrixC[i][j]) + " | ");
            }
            System.out.println();
            ;
        }
        for (int j = 0; j < matrixC[0].length; j++) {
            temp = matrixC[0][j];
            for (int i = 0; i < matrixC.length; i++) {
                if (temp < matrixC[i][j]) {
                    temp = matrixC[i][j];
                }
            }
            result+=temp;
        }
        System.out.println("The sum of the largest elements of each column of the matrix:" + result);
    }
}
