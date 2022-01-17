package Basics;

public class Arrays {

    public static void main(String[] args) {

        //Array = a collection data in same category

        //Default of element in same category
        int i = 11;
        int j = 7;
        int x = 9;
        int y = 10;

        //Convert them into array
        int[] myArray = {11, 7, 9, 10}; // define data type +array in [] + name of var = element of the array
                                        // element with same data type on in an array

        //Define empty array with known size
        int[] emptyArray = new int[5]; // empty array with size of 5( there is 5 elements)

        //Access the element of array
        System.out.println("a. Access Element");

        int z = myArray[3]; // in myArray the element in index 2 will be called
        System.out.println(z);

        //Change the element in the array **must be in the same data type**
        System.out.println("b. Change Element");

        myArray[0] = 8; // change the element of myArray in index 0 which is 11 into 8
        int v = myArray[0];
        System.out.println(v);

        //To access the last element in the array
        System.out.println("c. Access Last Element");

        int last_index = myArray.length-1; // length of myArray is 4 if -1 we get the last index element
        System.out.println(myArray[last_index]);

        //Print every element in the myArray using loop
        System.out.println("d. For Loop");

        for (int k = 0; k < myArray.length; k++) {
            System.out.println(myArray[k]);

        }

        System.out.println("e. While Loop");

        int h = 0;
        while (h < myArray.length) {
            System.out.println(myArray[h]);
            h++;
        }
    }
}
