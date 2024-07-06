package Section5.Operators;

// 5.1.6 Bitwise operators

public class BitwiseOperator {
    public static void main(String[] args) {
        /*
            &    Bitwise AND
            |    Bitwise OR
            ^   Bitwise XOR
            ~   Bitwise Complement
            <<  Left shift: Shifts the bits of the number to the left and fills 0 on voids left as a result.
            >>  Right shift: Shifts the bits of the number to the right and fills 0 on voids left as a result.
            >>> Unsigned right shift: Shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign bit of the original number.
         */

        /*
            4 & 5
            4 = 100
            5 = 101

            1 0 0
            & & &
            1 0 1
            -----
            1 0 0 = 4
         */

        System.out.println("4 & 5 = " + (4 & 5));
        System.out.println("4 | 5 = " + (4 | 5));
        System.out.println("4 ^ 5 = " + (4 ^ 5));
        System.out.println("~4 = " + (~4));

        System.out.println(Integer.toBinaryString(1));  // 00000001 32 bit      if the first bit is 1 then it is negative. 0 is positive
        System.out.println(Integer.toBinaryString(-1)); // 11111111 32 bit      negative numbers are represented using "Two's Complement".
        System.out.println(Integer.toBinaryString(2));  // 00000010 32 bit
        System.out.println(Integer.toBinaryString(-2)); // 11111110 32 bit

        System.out.println((byte) 0b11111110);  // -2

        /*
            binary: 10000000
            how to find the decimal value of this binary number?
            1 * 2^7 = 128 and the first bit is 1 so the number is negative
            the power of 2 is 7 because the rank of the bit(1) is 7
            decimal value = -128

            binary: 11000000
            1* -(2^7) + 1 * 2^6 = -128 + 64 = -64
            decimal value = -64
         */

        // Right shift
        System.out.println("5 = " + 0b101);
        System.out.println("5 >> 1 = " + (5 >> 1));  // 2
        /*
            5 = 101
            101 >> 1 = 10
            5 >> 1 = 10
            5 / 2 = 2
         */

        System.out.println("5 >> 2 = " + (5 >> 2));  // 1
        /*
            5 = 101
            101 >> 2 = 1
            5 >> 2 = 1
            5 / 4 = 1
         */

        System.out.println("5 >> 3 = " + (5 >> 3));  // 0
        /*
            5 = 101
            101 >> 3 = 0
            5 >> 3 = 0
            5 / 8 = 0
         */

        System.out.println("5 >> 4 = " + (5 >> 4));  // 0
        /*
            5 = 101
            101 >> 4 = 0
            5 >> 4 = 0
            5 / 16 = 0
         */

        // Unsigned right shift
        System.out.println("5 >>> 1 = " + (5 >>> 1));  // 2
        System.out.println("-5 >> 1 = " + (-5 >> 1));  // -3
        System.out.println("-5 >>> 1 = " + (-5 >>> 1));  // 2147483645

        /*
            -5 = 11111011
            -5 >> 1 = 11111101 = -3
            -5 >>> 1 = 01111101 = 2147483645
         */

        // Left shift
        System.out.println("10 = " + 0b1010);
        /*
            10 = 1010
            1010 >> 1 = 10100
            1010 << 1 = 10100

            conclusion:
                - shift right by n bits is equivalent to dividing by 2^n
                - shift left by n bits is equivalent to multiplying by 2^n

                example:
                    10 >> 1 = 10 / 2^1 = 5
                    10 << 1 = 10 * 2^1 = 20
         */

        System.out.println("10 << 1 = " + (10 << 1));  // 20





    }
}