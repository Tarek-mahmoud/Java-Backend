package Section6;

// 6.3 Escape sequence

public class ScapeSequence {
    public static void main(String[] args) {
        /*
            \t  Insert a tab
            \b  Insert a backspace.
            \n  Insert a newline
            \r  Insert a carriage return
            \f  Insert a form feed
            \'  Insert a single quote
            \"  Insert a double quote
            \\  Insert a backslash
         */

        System.out.println("Hello\tWorld");
        System.out.println("Hello\bWorld");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\rWorld there!");
        System.out.println("Hello\fWorld");
        System.out.println("Hello\'World");
        System.out.println("Hello\"World");
        System.out.println("Hello\\World");

        System.out.println("\u00A9 2024");
    }
}