package Inheritance;

public class Animal {

    //Ini dalah Parent Class
    //Inheritance = "pewarisan" <-- child class inherit the properties of the parent class

    //Attributes
    String name;

    //Constructor
    public Animal(String name) {
        this.name = name;
    }

    //Method
    public void eat() {
        System.out.println(this.name + " is eating fish");
    }

}
