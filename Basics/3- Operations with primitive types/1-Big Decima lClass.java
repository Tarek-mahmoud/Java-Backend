package Section5;

// 5.2 BigDecimal

/*
    - floating point numbers will most of the time return an answer with a small error (around 10^-19).
      But BigDecimal provides us with the exact answer.

    - The BigDecimal class provides operations on double numbers for arithmetic, scale handling, rounding, comparison,
      format conversion and hashing. It can handle very large and very small floating point numbers with great precision


 */

import java.math.BigDecimal;
import java.math.RoundingMode;

// 5.2.1 BigDecimal

public class BigDecimalClass {
    public static void main(String[] args) {

        float a = 0.03f;
        float b = 0.04f;
        double c = b-a;
        System.out.println(c);

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);
        System.out.println();


        int i = 20;
        System.out.println(i / 3);
        System.out.println((double) i / 3);

        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson);



    }
}