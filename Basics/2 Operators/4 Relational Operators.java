package Section5.Operators;

// 5.1.4 Relational operators

public class RelationalOperators {
    public static void main(String[] args) {
        /*
            ==
            !=
            >
            <
            >=
            <=
            note: the result is always boolean ( true or false )
         */

        int num1 = 123;
        int num2 = 127;

        System.out.println(num1 == num2);   // false
        System.out.println(num1 != num2);   // true
        System.out.println(num1 > num2);    // false
        System.out.println(num1 < num2);    // true
        System.out.println(num1 >= num2);   // false
        System.out.println(num1 <= num2);   // true
    }
}