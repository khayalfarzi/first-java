package az.company.firstjava.lesson3;

import java.util.Random;

public class StringAndMathExample {

    public static void main(String[] args) {

//        String greeting = " Hello ";
//        String name = "Farida";
//        String surname = "Nesibova";
//        System.out.println(greeting.toUpperCase());
//        System.out.println(greeting.toLowerCase());
//        System.out.println(name + surname);
//        System.out.println(name.concat(surname));
//        System.out.println(name.indexOf("r"));

        Random random = new Random();
        int max = Math.max(5, 8); //8
        int min = Math.min(5, 8);//5
        int abs = Math.abs(-89);// 89
        double rand = Math.random();// IDK

        System.out.println(max);
        System.out.println(min);
        System.out.println(abs);
        System.out.println(rand);
        System.out.println(random.nextInt(100));
    }
}
