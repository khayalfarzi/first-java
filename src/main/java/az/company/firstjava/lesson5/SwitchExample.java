package az.company.firstjava.lesson5;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter car max speed witch you want to now car model ");
        int maxSpeed = scanner.nextInt();

        switch (maxSpeed) {

            case 450:
                System.out.println(" This max speed belong to Mercedes");
                break;
            case 400:
                System.out.println("This max speed belong to BMW");
                break;
            case 350:
                System.out.println("This max speed belong to Opel");
                break;
            case 300:
                System.out.println("This max speed belong to Chevrolet");
                break;
            case 250:
                System.out.println("This max speed belong to Hundai");
                break;
            case 200:
                System.out.println("This max speed belong to Toyota");
                break;
            default:
                System.out.println(" can't find any model");
        }
    }
}
