package Pack1;

public class AccessModifier2 {

    public static void main(String[] args) {

        // create an object to access non static attributes and method in AccessModifier1
        AccessModifier1 class1 = new AccessModifier1();
        System.out.println(class1.name);
    }
}
