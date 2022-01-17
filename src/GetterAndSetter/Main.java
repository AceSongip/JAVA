package GetterAndSetter;

public class Main {

    public static void main(String[] args) {

        // Object with no attribute aka blueprint
        Car car1 = new Car();

        // Set the attributes into the object blueprint above
        car1.setBrand("Tesla");
        car1.setSubBrand("Model S");

        // Get the attribute for the object with attribute already set using SETTER
        System.out.println(car1.getBrand());
        System.out.println(car1.getSubBrand());

        // If I want to change the setter attributes in this object
        car1.setBrand("Perodua");
        car1.setSubBrand("Myvi");
        System.out.println(car1.getBrand()); // <-- you will see that this one cannot print because refers brand setter
//        System.out.println(car1.getSubBrand());

    }
}
