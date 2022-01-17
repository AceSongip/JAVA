package ClassObjectConductor;

public class ClassAndObject {

    // In this case "ClassObjectConductor.ClassAndObject" is the class

    //attributes
    String name = "Ehsan";

    //methods <-- same as function because it exists inside a class
    public void eat() {
        System.out.println(this.name+ " is eating"); // this.name indicate the string name can change to others
    }


    public static void main(String[] args) { // <-- This is main function, short key = "psvm"

        // Class and Object is used to make the sure the code in good arrangement
        // Class = eg: BLUEPRINT(car), contains methods(getFuel) and attributes(fuel)
        // Object = eg: car but different brands with different methods and attributes

        // Create an object (Class + object variable = new object) <-- Object must inside main function
        ClassAndObject man1 = new ClassAndObject();

        //How to access attribute?
        System.out.println(man1.name);
        //How to change attribute?
        man1.name = "Ahmad";

        //How to access method?
        man1.eat();

    }
}
