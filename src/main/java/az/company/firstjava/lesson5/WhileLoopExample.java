package az.company.firstjava.lesson5;

import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max number: ");
        int max = scanner.nextInt();
        int number = 0;
        while (number < max) {
            System.out.println("number = " + number);
            number++;
        }
    }
}
