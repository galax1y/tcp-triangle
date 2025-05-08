package org.example;

import jdk.jshell.spi.ExecutionControl;

import java.util.Dictionary;


/*
* Triangle class has no input validation
* When operations are needed, it should calculate through its private IsValid function
*
 */

public class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static boolean IsValid(Triangle t) {
        // Triangle sides must not empty or negative
        if (t.a <= 0 || t.b <= 0 || t.c <= 0) {
            return false;
        }

        return SumOfTwoSidesGreaterThanRemaining(t.a, t.b, t.c);
    }

    // Takes three numbers as input and grants that the sum of any two of them are greater than the remaining one
    private static boolean SumOfTwoSidesGreaterThanRemaining(int a, int b, int c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    public static String GetTriangleType(Triangle t) {
        if (!Triangle.IsValid(t)) {
            return "Invalid";
        }

        if (t.a != t.b && t.b != t.c && t.a != t.c)
            return "Scalene";

        if (t.a == t.b && t.b == t.c)
            return "Equilateral";

        return "Isosceles";
    }
}
