package Pack1;

import java.awt.*;

public class AccessModifier1 {

    //Access modifier = "mengubah kebenaran menggunakan sesuatu perkara"
    //This is used to control the access of attributes and methods from one class to another

    //Type of Access modifier
    //1) public <-- all can access in public even the class in different package
    //2) private <-- only class1 @ AccessModifier1 can use the attributes and methods in its class
    //3) default <-- default is when we don't put anything in front of attribute or method (only can be in same package)
    //4) protected <-- same like DEFAULT but if another package wants to use need an extension to the target class

    protected String name = "Ehsan";

    // void method
    public void hello() {
        System.out.println("Salam");
    }
}
