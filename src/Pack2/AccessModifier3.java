package Pack2;

import Pack1.AccessModifier1; // package1 imported since AccessModifier3 in different package

//When the Accessmodifier1 is protected "extends" is used to access the properties
public class AccessModifier3 extends AccessModifier1{

    public static void main(String[] args) {
        AccessModifier3 class2 = new AccessModifier3(); // object class 3 because it is the extension of class 1 (Inheritance
        System.out.println(class2.name);
    }
}
