// array declaration and initialization

public class Main {
    public static void main(String[] args) {
        int[] arr1; // more clear
        int arr2[];

        arr1 = new int[10]; // initialize arr1
        System.out.println(arr1.length);    // Displays the length of array
        System.out.println(arr1[0]);

        double[] arr3 = new double[5];
        //System.out.println(arr3[5]);    // runtime exception

        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);

        int[] arr5 = {1, 2, 3}; // array literals
	System.out.println(Arrays.toString(arr5));


    }
}
