package Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("oyen");
        Bird bird1 = new Bird ("Kakak", 20.5);

        animal1.eat();
        bird1.eat(); // Bird is the child class of parent class(Animal) also inherit the properties
        bird1.fly(); // bird.fly is the method only owned by the child class BIRD

        //conclusion = inheritance allows us to change/add properties of the child class

    }
}
