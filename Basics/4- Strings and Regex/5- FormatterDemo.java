package Section6;

import java.util.Formatter;

// 6.5 String formating

public class FormatterDemo {
    public static void main(String[] args) {
        // Create formatter class object
        Formatter formatter = new Formatter();

        formatter.format("%d", -111);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%d", 111);
        System.out.println(formatter);
        System.out.println();

        formatter = new Formatter();
        formatter.format("%+d", 111);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("+%(d", -111);
        System.out.println(formatter);

        // comma specifier
        formatter = new Formatter();
        formatter.format("%, d", 1000000000);   // 1,000,000,000
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%, 3f", 423432432432.423432);
        System.out.println(formatter);

        // right justify
        formatter = new Formatter();
        formatter.format("%20.4f", 1234.123456789);   // it will print 20 characters in total and 4 decimal places
        System.out.println(formatter);

        // left justify
        formatter = new Formatter();
        formatter.format("%-20.4f", 1234.123456789);   // it will print 20 backspaces in total and 4 decimal places
        System.out.println(formatter);

        // %% format specifier
        formatter = new Formatter();
        formatter.format("10 %% 4 = 2");
        System.out.println(formatter);

        // %x format specifier
        // It prints the number in Hexadecimal
        // with lowercase alphabets
        formatter = new Formatter();
        formatter.format("%x", 250);
        System.out.println(formatter);

        // %e format specifier
        // It prints the number in Scientific Notation
        // with lowercase alphabets
        formatter = new Formatter();
        formatter.format("%e", 123.1234);
        System.out.println(formatter);

        // Format 4 places.
        // The %g format specifier causes Formatter
        // to use either %f or %e, whichever is shorter
        formatter = new Formatter();
        formatter.format("%.4g", 123.1234567);  // g denotes to %f or %e
        System.out.println(formatter);
    }
}
