package Section5.HomeWork;

import java.util.Scanner;

public class CalculateAreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter A side of a triangle: ");
        float a = sc.nextFloat();
 
        System.out.print("Please, enter B side of a triangle: ");
        float b = sc.nextFloat();

        System.out.print("Please, enter C side of a triangle: ");
        float c = sc.nextFloat();

        double triangleArea = 0 / 0.0;
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println(triangleArea);
            return;
        }
        float p = (a + b + c) / 2;
        triangleArea = Math.sqrt(p * (p-a) * (p-b) * (p-c) );

        System.out.println("Triangle area is: " + triangleArea);

    }
}
