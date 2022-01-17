package ClassObjectConductor;

public class Constructor {

    // In this case "ClassObjectConductor.ClassAndObject" is the class

    //attributes
    String name;
    int age;
    String gender;

    //ClassObjectConductor.Constructor <-- Usually place in between attributes and methods
    //ClassObjectConductor.Constructor is public + class name + parameter
    public Constructor (String givenName, int givenAge, String givenGender) { //() can insert more than one parameter
        this.name = givenName;
        this.age = givenAge;
        this.gender = givenGender;

    }

    //methods <-- same as function because it exists inside a class
    public void eat() {
        System.out.println(this.name+ " is eating"); // this.name indicate the string name can change to others
    }

    public static void main(String[] args) {

        //We use constructor so that the object is not fix into one attribute
        //We use constructor so that we can define the attribute inside object parenthesis
        Constructor man2 = new Constructor("Ehsan", 25,"male");
        Constructor man3 = new Constructor("NickArabella", 24, "female");

        //Now we can print out 3 different data type which is "name", "age" and "gender"
        System.out.println(man2.gender);
        System.out.println(man3.age);
    }
}
