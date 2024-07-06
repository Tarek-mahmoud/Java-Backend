package Section6;

// 6.4 String formating

public class StringFormating {
    public static void main(String[] args) {
        // In the web application, we want to display the user name and the time of day in a greeting message. We can use the String.format() method to format the string.
        String template = "Hello, dear %S! Good %s!"; // s denotes to string
        String name = "Amina";
        String time = "morning";
        String generatedString = String.format(template, name, time);
        System.out.println(generatedString);

        int x = 10;
        System.out.printf("my T-shirt size if %d\n", x);    // d denotes to integer

    }
}