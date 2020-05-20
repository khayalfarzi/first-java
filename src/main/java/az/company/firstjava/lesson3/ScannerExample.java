package az.company.firstjava.lesson3;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to our project ");
        System.out.println(" Enter first number");
        int first = scanner.nextInt();;

        System.out.println(" Enter second number");
        int second = scanner.nextInt();

        System.out.println(" Sum of two elements : " + (first + second));
    }
}