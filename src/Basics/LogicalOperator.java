package Basics;

public class LogicalOperator {

    public static void main(String[] args) {

        //Logical Operator

        //1) &&(AND) --> ALL the conditions(TRUE) return TRUE
        //2) ||(OR) --> Only ONE condition(TRUE) return TRUE
        //3) !(NOT) --> if statement is TRUE returns FALSE
        //4) && >> || --> statement && will be executed first then ||

        // 1) &&(AND)
        boolean statement1 = 18 > 3; //True
        boolean statement2 = 3 < 2; // False

        boolean overall = statement1 && statement2; // True AND False = False
        System.out.println(overall);

        //2) ||(OR)
        boolean statement3 = 18 > 3; //True
        boolean statement4 = 3 < 2; // False

        boolean overall2 = statement3 || statement4; // True OR False = True
        System.out.println(overall2);

        //3) !(NOT)
        boolean statement5 = 18 > 3; //True
        boolean statement6 = 3 < 2; // False

        boolean overall3 = statement5 && !statement6; // True AND !False(TRUE) = True
        boolean overall4 = !(statement5 && !statement6); // !(True AND !False(TRUE)) = False
        System.out.println(overall3);
        System.out.println(overall4);

        //4) More than 2 statements (&& >> ||)

        boolean statement7 = 18 > 3; //True
        boolean statement8 = 3 < 2; // False
        boolean statement9 = 5 > 3; // True

        boolean overall5 = statement7 || statement8 && statement9; // Statement8 && statement9(execute 1st) then compare with statement7
        System.out.println(overall5);



    }
}
