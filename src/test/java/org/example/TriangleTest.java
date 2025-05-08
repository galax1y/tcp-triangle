package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("Should return false for validity of a triangle if any side is equal to zero")
    void TestFor_ZeroInput() {
        assertFalse(Triangle.IsValid(new Triangle(0, 4, 5)));
        assertFalse(Triangle.IsValid(new Triangle(3, 0, 5)));
        assertFalse(Triangle.IsValid(new Triangle(3, 4, 0)));
    }

    @Test
    @DisplayName("Should return false for validity of a triangle if any side is negative")
    void TestFor_NegativeInput() {
        assertFalse(Triangle.IsValid(new Triangle(-1, 4, 5)));
        assertFalse(Triangle.IsValid(new Triangle(3, -1, 5)));
        assertFalse(Triangle.IsValid(new Triangle(3, 4, -1)));
    }

    @Test
    @DisplayName("Should return IsValid true for a valid scalene triangle")
    void TestFor_ValidScaleneTriangle() {
        Triangle scalene = new Triangle(3, 4, 5);
        assertTrue(Triangle.IsValid(scalene));
    }

    @Test
    @DisplayName("Should return IsValid true for a valid isosceles triangle")
    void TestFor_ValidIsoscelesTriangle() {
        Triangle isosceles = new Triangle(5, 5, 8);
        assertTrue(Triangle.IsValid(isosceles));
    }

    @Test
    @DisplayName("Should return IsValid true for a valid isosceles triangle - Permutation 1")
    void TestFor_IsoscelesFirstPermutation() {
        Triangle isosceles = new Triangle(6, 5, 5);
        assertTrue(Triangle.IsValid(isosceles));
    }

    @Test
    @DisplayName("Should return IsValid true for a valid isosceles triangle - Permutation 2")
    void TestFor_IsoscelesSecondPermutation() {
        Triangle isosceles = new Triangle(5, 6, 5);
        assertTrue(Triangle.IsValid(isosceles));
    }

    @Test
    @DisplayName("Should return IsValid true for a valid isosceles triangle - Permutation 3")
    void TestFor_IsoscelesThirdPermutation() {
        Triangle isosceles = new Triangle(5, 5, 6);
        assertTrue(Triangle.IsValid(isosceles));
    }

    @Test
    @DisplayName("Should return IsValid true for valid equilateral triangle")
    void TestFor_ValidEquilateralTriangle() {
        Triangle equilateral = new Triangle(2, 2, 2);
        assertTrue(Triangle.IsValid(equilateral));
    }

    @Test
    @DisplayName("Should be able to return a valid triangle's type accordingly")
    void TestFor_GetTriangleType() {
        Triangle invalid = new Triangle(3, 3, 6);
        Triangle scalene = new Triangle(3, 4, 5);
        Triangle isosceles = new Triangle(5, 5, 6);
        Triangle equilateral = new Triangle(2, 2, 2);

        assertEquals("Invalid", Triangle.GetTriangleType(invalid));
        assertEquals("Scalene", Triangle.GetTriangleType(scalene));
        assertEquals("Isosceles", Triangle.GetTriangleType(isosceles));
        assertEquals("Equilateral", Triangle.GetTriangleType(equilateral));
    }

    @Test
    @DisplayName("Should return false when sum of two sides of a triangle are equal to a third - Permutation 1")
    void TestFor_SumOfSidesEqualsRemainingSideFirstPermutation() {
        Triangle t = new Triangle(3,3,6);
        assertFalse(Triangle.IsValid(t));
    }

    @Test
    @DisplayName("Should return false when sum of two sides of a triangle are equal to a third - Permutation 1")
    void TestFor_SumOfSidesEqualsRemainingSideSecondPermutation() {
        Triangle t = new Triangle(3,6,3);
        assertFalse(Triangle.IsValid(t));
    }

    @Test
    @DisplayName("Should return false when sum of two sides of a triangle are equal to a third - Permutation 1")
    void TestFor_SumOfSidesEqualsRemainingSideThirdPermutation() {
        Triangle t = new Triangle(6,3,3);
        assertFalse(Triangle.IsValid(t));
    }

    @Test
    @DisplayName("Should return false when sum of two sides of a triangle are smaller than the third - Permutation 1")
    void TestFor_SumOfSidesSmallerThanRemainingSideFirstPermutation() {
        Triangle t = new Triangle(3,3,7);
        assertFalse(Triangle.IsValid(t));
    }

    @Test
    @DisplayName("Should return false when sum of two sides of a triangle are smaller than the third - Permutation 2")
    void TestFor_SumOfSidesSmallerThanRemainingSideSecondPermutation() {
        Triangle t = new Triangle(3,7,3);
        assertFalse(Triangle.IsValid(t));
    }

    @Test
    @DisplayName("Should return false when sum of two sides of a triangle are smaller than the third - Permutation 3")
    void TestFor_SumOfSidesSmallerThanRemainingSideThirdPermutation() {
        Triangle t = new Triangle(7,3,3);
        assertFalse(Triangle.IsValid(t));
    }

    @Test
    @DisplayName("Should return IsValid false for a triangle with all sides zero")
    void TestFor_AllSidesEqualToZero() {
        Triangle t = new Triangle(0,0,0);
        assertFalse(Triangle.IsValid(t));
    }
}
