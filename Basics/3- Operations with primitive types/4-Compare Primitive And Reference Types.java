package Section5;

// 5.5 Increment and decrement operators

import java.util.Arrays;

public class ComparePrimitiveAndReferenceTypes  {
    public static void main(String[] args) {

        System.out.println("65 == 'A': " + (65 == 'A'));  // true

        int i1 = 10;
        int i2 = 10;
        System.out.println("i1 == i2: " + (i1 == i2));  // true

        Integer n = 128;
        Integer n2 = 128;
        System.out.println("n == n2: " + (n == n2));  // false
        // n and n2 are reference types, so they store the reference to the object in the heap

        Integer n3 = 127;
        Integer n4 = 127;
        System.out.println("n3 == n4: " + (n3 == n4));  // true
        // n3 and n4 are reference types, but they are in the range of -128 to 127, so they are referring to the same object in the heap
        // in heap memory, there is a pool of objects for Integer from -128 to 127, so if you create an Integer object in this range, it will refer to the same object in the pool
        // to save memory and improve performance two Integer objects in this range will refer to the same object in the pool

        /*
           - New keyword
             New keyword is used to create a new object in the heap
             previous objects are stored in the pool, so if you create a new object with the same value, it will refer to the same object in the pool
        */
//        Integer n5 = new Integer(10); // error
//        Integer n6 = new Integer(10);   // error
        // this way of creating an object is deprecated, why? because it creates a new object in the heap every time you use the new keyword

        Integer n5 = Integer.valueOf(70);
        Integer n6 = Integer.valueOf(70);
        System.out.println("n5 == n6: " + (n5 == n6));  // true
        /* valueOf() method is used to create an Integer object, but it will check if the object is in the pool,
         if it is, it will return the reference to the object in the pool, if not, it will create a new object in the heap*/

        // what we do if we cannot use the == operator to compare two reference types?. all reference types have the equals() method to compare two objects
        System.out.println("n5.equals(n6):" + n5.equals(n6));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("arr1 == arr2: " + (arr1 == arr2)); // false because arr1 and arr2 are reference types
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2)); // false because arr1 and arr2 are reference types
        // the equals() method in the array class compares the reference of the array, not the content of the array
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));

        arr1 = arr2;    // now arr1 and arr2 are referring to the same object in the heap
        System.out.println("arr1 == arr2: " + (arr1 == arr2)); // true


    }
}