package Inheritance;

// Bird Class will inherit the properties from Animal Class
// Parent class cannot inherit child properties
public class Bird extends Animal {

    // Only Bird attribute
    double weight;

    public Bird (String name, double weight) {
        super(name); // super is used to call the constructor of the PARENT CLASS
        this.weight = weight;
    }

    public void fly() {
        System.out.println(this.name + " is flying with weight: " + weight);
    }

    //Override method sedia ada dari parent class
    //Ubah method yang diwarisi child (bird) from parent (animal)
    public void eat() {
        System.out.println(this.name + " is eating a worm");
    }
}
