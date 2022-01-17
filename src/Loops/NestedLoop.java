package Loops;

public class NestedLoop {

    public static void main(String[] args) {

        // Nested = sarang
        // Nested loop is like a loop inside a loop
        // Eg: for loop inside a while loop
        // Outside loop will run first then inside loop will run

        // Outside while + inside while
        int x = 0;
        while (x<3) {
            System.out.println("x: " + x); // first loop runs

            int y = 0; // if want to reset this value after first x iteration the variable of y must insert in the block
            while (y<=3) {
                System.out.println("y: " + y); // then inside loop will run until y =3
                y++;
            }
        x++; // outside loop will get update until x = 2
        }
        System.out.println("1st Nested Loop Ended");

        // Outside For loop + inside While loop
        for (int i = 0; i <= 2; i++) {
            System.out.println("i: " + i + " iteration");

            int j = 0;
            while (j<3) {
                System.out.println("j: " + j +" iteration");
                j++;
            }
        }
        System.out.println("2nd Nested Loop Ended");




    }
}
