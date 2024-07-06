package Section5;

// 5.4 Types of expressions

/*
    - Difference between statement and expression
        - A statement is a complete command that performs some action, while an expression is a part of a statement that produces a value.
        - A statement can contain one or more expressions.
        - An expression can be a part of a statement, but a statement cannot be a part of an expression.
        example:
            - int x = 10;  // statement
            - x = 10;  // expression
            - x + 10;  // expression
            - x = x + 10;  // statement

    - There are three types of expressions in Java:
        - Assignment expressions
        - Arithmetic expressions
        - Compound assignment expressions
 */

public class TypesOfExpressions {
    public static void main(String[] args) {

        // byte
        /*
            - when you add two bytes, the result will be an int
            - so you need to cast it to byte
         */
        byte a = 10;
        byte b = 20;
        /*
            byte sum = a + b;  // error
            byte sub = a - b;   // error
            byte mul = a * b;   // error
            byte div = a / b;   // error

            conclusion: the arithmetic operations on byte, short, and char will return an int
            you need to cast it to the appropriate type
         */

        System.out.println(a + b);  // 30 (int)
        byte c = (byte) (a + b);
        System.out.println(c);  // 30   (byte)

        /*
            long + int = long
            long + float = float
            long + double = double
         */

        // string concatenation
        // string + any type = string
        String str = "Hello";
        int num = 10;
        System.out.println(str + " " + num);  // Hello10
        System.out.println("Hello " + null);  // Hellonull
        // System.out.println("hello" - 10);  // error


    }
}