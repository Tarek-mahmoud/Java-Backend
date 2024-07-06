

public class Main {
    public static void main(String[] args) {
        byte b1 = 2;
        short s = 10;
        int i = 44;
        long l = 3;

        boolean bool = true;
        char c = 'D';
        float f = 1.4f;

        long l1 = 2_000_000_000;
        long l2 = 2_000_000_000_000l;

        double d = 1.3;

        var v1 = 1;
        var v2 = 'T';

        int i3 = s;

        char c2 = 100;
        System.out.println(c2);

        double d2 = i3;

        byte b2 = (byte)1000;   // byte overflow
        System.out.println(b2);

        long num1 = 499_999_999_000_000_001l;
        double num2 = (double)num1;
        System.out.println(num1 - (long)num2);

        
        Integer i4 = 1;   // autoboxing
        int i5 = i4;    // unboxing
        



    }
}
