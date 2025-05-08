package org.example;

import java.util.Scanner;

/*
* Main function role:
* 1. Collects three integers from the user
* 2. Instances a triangle with the integers
* 3. Checks for triangle validity, lets the user know
* 4. Check triangle type, lets the user know
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = readInteger(scanner, "Enter the first integer: ");
        int second = readInteger(scanner, "Enter the second integer: ");
        int third = readInteger(scanner, "Enter the third integer: ");

        scanner.close();

        Triangle t = new Triangle(first, second, third);

        if (!Triangle.IsValid(t)) {
            System.out.println("Triangle is NOT valid.");
        }

        System.out.println("Triangle is valid");
        String triangleType = Triangle.GetTriangleType(t);
        System.out.println("Triangle type: " + triangleType);

    }

    private static int readInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}