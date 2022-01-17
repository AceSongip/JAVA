package Basics;

public class Function {

    // Basics.Function will accept argument/parameter
    // Basics.Function will return a value

    // To define a new function, must be outside main function

    // if I want to return nothing from a function use "VOID"
    public static void varName(int a, int b) {
        // Block of code
    }

    // if I want to return an integer from a function use "INT"
    public static int addition(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static void main(String[] args) { // <-- This is main function

        // How to call the function?
        int ans = addition(5,8);
        System.out.println(ans); // print function only works in main function
    }


}
