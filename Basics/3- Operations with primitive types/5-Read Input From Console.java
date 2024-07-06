package Section5;

// 5.6 Read input from console

import java.util.Scanner;
// import System.out; // error In Java, System.out is not a package or a class, so it cannot be imported. System is a final class and out is a static member of the System class. Therefore, you don't need to import System.out; you can directly use it in your code.

public class ReadInputFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // What is System.in? System.in is an InputStream object that is typically connected to the keyboard input of your computer.

        String name;
        System.out.println("Enter your name: ");
        name = input.next();    // When you call the next() method, program execution will pause until the user enters a string and presses the Enter key.
        System.out.println("Hello " + name);

        int age;
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("You age: " + age);

        double salary;
        System.out.println("Enter your salary: ");
        salary = input.nextDouble();
        System.out.println("Your salary: " + salary);
    }
}
