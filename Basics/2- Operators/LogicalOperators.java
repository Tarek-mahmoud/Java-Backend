package Section5.Operators;

// 5.1.5 logical operators

public class LogicalOperators {
    public static void main(String[] args) {
        /*
            ! not
            & and
            && short circuit and
            | or
            || short circuit or
            ^ xor
         */

        //System.out.println(false & (5 / 0 == 0) );   // & and operator check all operands => runtime exception
        System.out.println(false && (5 / 0 == 0));  // && short circuit and operator stop when it finds false
        System.out.println(true && false && (5 / 0 == 0));  // && short circuit and operator stop when it finds false
        System.out.println();

        //System.out.println(true | (5 / 0 == 0));    // | or operator check all operands => runtime exception
        System.out.println(true || (5 / 0 == 0));   // || short circuit or operator
        System.out.println();

        System.out.println("! true = " + !true);
        System.out.println();

        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);




    }
}