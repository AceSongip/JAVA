package StaticAndNonStatic;

public class Static1 {

    //Attributes
    String name = "Non-Static Ehsan";
    static String name1 = "Static Ehsan";

    //ClassObjectConductor.Constructor
    public Static1() {

    }

    //Non-static method
    public void method1() {
        System.out.println("This is non-static method");
    }

    //Static Method
    public static void method2() {
        System.out.println("This is static method");
    }
}
