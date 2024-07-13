package Section5.Operators;

// 5.1.1 Unary operators

public class UnaryOperators {
    public static void main(String[] args) {

        /*
            +
            -
            ++
            --
         */

        int num1 = +10;     // unary plus operator
        int num2 = -10;     // unary minus operator
        num1++;
        --num2;
        System.out.println(num1);   // 11
        System.out.println(num2);   // -11
    }
}