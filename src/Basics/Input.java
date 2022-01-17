package Basics;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // String Basics.Input
        System.out.println("Please insert name: ");
        String name = scan.next(); // .next = String, .nextInt = integer, .nextBoolean = boolean, ......

        System.out.println("Hi how are you? " + name);

        // String Integer
        System.out.println("Please insert the number: ");
        int num = scan.nextInt();

        System.out.println("Your number is: " + num);
    }
}
