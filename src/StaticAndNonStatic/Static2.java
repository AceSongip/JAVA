package StaticAndNonStatic;

public class Static2 {

    // This new StaticAndNonStatic.Static2 class will access the attributes and method from the StaticAndNonStatic.Static1 Class
    // The reason we need a static method/attribute is because we want an independent method/attributes without new object

    public static void main(String[] args) {

        // Static method can be called without create an object
        Static1.method2(); //1st class(StaticAndNonStatic.Static1) + static method in 1st class

        // If I want to access non-static method, first must create an object
        Static1 nonStat = new Static1(); // <--Object

        nonStat.method1(); // new object "nonStat" can call non or static methods

        // Can also call attributes from StaticAndNonStatic.Static1 class

        //Static
        System.out.println(Static1.name1);

        //Non Static
        System.out.println(nonStat.name);

    }
}
