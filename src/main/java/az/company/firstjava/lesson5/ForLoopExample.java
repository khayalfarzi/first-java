package az.company.firstjava.lesson5;

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter max number: ");
        int max = scanner.nextInt();

        for (int i = 0; i < max; i++) {
            System.out.println("i = " + i);
        }
    }
}
