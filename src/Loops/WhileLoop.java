package Loops;

public class WhileLoop {

    public static void main(String[] args) {

        // Loop to tell the computer to iterate many times
        // While loop will iterate as long as condition is true
        // While loop will check the condition first then print the variable value

        //1)While Loop
//        while(condition) {
//            // Block of Code

        int x = 0;
        while (x <= 10) {
            System.out.println(x); // if put variable x in print fx, x + 1 in every iteration
            x++; // x = x+1, until x = 10 is true, x=11 is false then loop stops
        }
        System.out.println("Finish Loop");


        //2) Do While Loop
        // Do While loop will print the fx y =1 first then check the condition
        int y = 1;
        do {
            System.out.println(y);
        } while (y == 0);

        System.out.println("Loop Ends");
    }
}
