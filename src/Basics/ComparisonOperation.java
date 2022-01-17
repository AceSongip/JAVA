package Basics;

public class ComparisonOperation {

    public static void main(String[] args) {

        /* Comparison operator
        1) ==
        2) !=
        3) >=
        4) <=
        5) >
        6) <
         */

        boolean bool1 = 1 == 1;
        System.out.println(bool1);

        boolean bool2 = 1 != 1;
        System.out.println(bool2);

        boolean bool3 = 1 >= 1;
        System.out.println(bool3);

        boolean bool4 = 1 <= 1;
        System.out.println(bool4);

        boolean bool5 = 1 > 1;
        System.out.println(bool5);

        boolean bool6 = 1 < 1;
        System.out.println(bool6);

        // String Comparison

        boolean boolStr = "Hello".equals("Hello"); // use .equals
        System.out.println(boolStr);
    }
}
