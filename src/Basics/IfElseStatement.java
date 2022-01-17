package Basics;

public class IfElseStatement {

    public static void main(String[] args) {

//        if(condition){
//            //True, Run this block
//        } else {
//            //True, Run this block
//        }

        String gender = "male"; // male variable
        String genderF = "female"; // female variable

        if (gender == "male") {
            System.out.println("Enter Male Toilet"); //statement 1 is true then stop

        } else if (genderF == "female"){
            System.out.println("Enter Female Toilet"); // if statement 1 is false then this statement 2 will be executed
        }
        else
        {
            System.out.println("Unknown Gender"); // if both statements are false this block will be executed
        }

        // Conclusion: if can stand alone but else if and else cannot exist without if

    }
}
