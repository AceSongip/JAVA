package Basics;

public class SwitchStatement {

    public static void main(String[] args) {

        // Switch uses as to check if there's any case true to the variable
        // if no case similar to variable then it returns DEFAULT
        // BREAK function is to stop the return after one case TRUE

        int i = 1;

        switch (i) {
            case 1:
                System.out.println("Case 1");
                break; // remember if case 1 is true without break statement it will return until case with break or straight to default
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default");
        }
    }
}
