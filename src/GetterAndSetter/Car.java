package GetterAndSetter;

// Getter = mendapatkan <-- to get the attribute from an object
// Setter = menetapkan <-- to set or change the attribute in an object
// to generate getter and setter with Intellij = right click + generate + Getter and Setter + highlight all attributes

public class Car {

    //Attribute <-- make it private so that it cannot be changed in another class
    private String brand;
    private String subBrand;

    //Constructor
    public Car() {

    }

    //Setter <-- because we want to set something so no need to return something, must be void. Setter similar with method

    // Brand setter <-- Original Setter
//    public void setBrand (String brand){
//        this.brand = brand;
//    }

    // If I want to lock only one brand I made this statement
    public void setBrand (String brand) {
        if (this.brand == null) {
            this.brand = brand;
        }else {
            System.out.println("BRAND ALREADY AVAILABLE");
        }
    }

    // subBrand setter
    public void setSubBrand (String subBrand) {
        this.subBrand = subBrand;
    }

    //Getter <-- because we want to get something with getter, we need to return a value so must return a STRING

    //Get Brand <-- original getter
    public String getBrand () {
        return this.brand;
    }

    //Get subBrand <-- original getter
    public String getSubBrand () {
        return this.subBrand;
    }




}
