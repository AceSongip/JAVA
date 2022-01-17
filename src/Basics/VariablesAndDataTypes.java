package Basics;

public class VariablesAndDataTypes {

    public static void main(String[] args) {

/*        Primitives

          byte(number, 1 byte)
          short(number, 2 bytes)
          int(number, 4 bytes)
          long(number, 8 bytes)
          float(float number, 4 bytes)
          double(float number, 8 bytes)
          char(a character, 2 bytes)
          boolean(true or false, 1 byte)

 */

        // Variables (container to store elements)

        int myInteger; // integer variable
        myInteger = 100;
        System.out.println(myInteger);

        double myDouble = 97.5; // decimal variable
        System.out.println(myDouble);

        char myChar1, myChar2, myChar3; // many variable in same category in same line (char is single alphabet)
        myChar1 = 'a';
        myChar2 = 'b';
        myChar3 = 'c';
        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println(myChar3);

        boolean myBool = true; // Boolean for true and false
        boolean myBool2 = false;
        System.out.println(myBool);

        String myString = "Ehsan"; // String starts with big "S"
        System.out.println(myString);
        myString = "Mohd"; // change above myString variable into different element
        System.out.println(myString);
    }
}
