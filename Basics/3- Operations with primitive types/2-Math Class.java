package Section5;

// 5.3 Math class

/*
    - Math class contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.

    - Math class is a final class, which means that we cannot inherit it.

    - All the methods in the Math class are static, so we can call them directly using the class name.

    - Math class has two constants:
        - PI: the value of PI
        - E: the value of Euler's number

    - Math class has many methods, some of them are:
        - abs(): returns the absolute value of a number
        - ceil(): returns the smallest integer that is greater than or equal to the argument
        - floor(): returns the largest integer that is less than or equal to the argument
        - max(): returns the maximum of two numbers
        - min(): returns the minimum of two numbers
        - pow(): returns the value of the first argument raised to the power of the second argument
        - random(): returns a random number between 0.0 and 1.0
        - round(): returns the closest long or int, as appropriate, to the argument
        - sqrt(): returns the square root of a number
 */

public class MathClass {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.max(3, 7));
        System.out.println(Math.min(3, 7));
        System.out.println(Math.abs(-10));
        System.out.println(Math.sqrt(4));

        System.out.println(Math.sqrt(-1));  // NaN (Not a Number)
        System.out.println((0 / 0.0));  // NaN (Not a Number)
        System.out.println((0 / 0.0) + 5);  // NaN (Not a Number)

        System.out.println(5 / 0.0);  // Infinity
        System.out.println(-5 / 0.0);  // -Infinity

        System.out.println(Math.round(20.0 / 3.0)); // 7
        System.out.println(Math.round(20.0 / 3.0 * 100) / 100.0); // 6.67

        System.out.println(Math.random());  // random number between 0.0 and 1.0
        System.out.println((int) (Math.random() * 100));  // random number between 0 and 100
        System.out.println((int) Math.random() * 100 + 100);    // random number between 100 and 200


    }
}

