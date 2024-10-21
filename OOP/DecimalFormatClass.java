
/*
    - The "#.##" means it will print the number with maximum two decimal places whereas "#.00" means it will always display
        two decimal places and if the decimal places are less than two, it will replace them with zeros.

    - There are 11 Special Pattern Characters, but the most important are:
        0 – prints a digit if provided, 0 otherwise
        # – prints a digit if provided, nothing otherwise
        . – indicate where to put the decimal separator
        , – indicate where to put the grouping separator
 */

import java.text.DecimalFormat;

public class DecimalFormatClass {
    public static void main(String[] args) {

        DecimalFormat df1 = new DecimalFormat( "#.##" );
        DecimalFormat df2 = new DecimalFormat("#.00");

        System.out.println(df1.format(7.80));
        System.out.println(df1.format(85));
        System.out.println(df1.format(85.786));
        System.out.println();

        System.out.println(df2.format(7.80));
        System.out.println(df2.format(85));
        System.out.println(df2.format(85.786));
    }
}
