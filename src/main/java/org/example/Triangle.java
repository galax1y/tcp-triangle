package org.example;

/*
* Triangle Class

* Methods:
* IsValid checks for triangle validity
* SumOfTwoSidesGreaterThanSmaller is a private helper method for IsValid
* GetTriangleType
*
* All of them are static so that they can be used with freedom and not necessarily attached to a Triangle instance
*/

public class Triangle {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Given a triangle object, mathematically checks for its validity
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

    // Returns a string according to the triangle types - "Scalene", "Isosceles" and "Equilateral"
    // If trying to get type from an invalid triangle, returns "Invalid"
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
