package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolynomialTest {

    @Test
    public void testAddPolynomialsByArray() {
        Polynomial poly1 = new Polynomial(new int[]{3, 2, 5}); // Represents 3 + 2x + 5x^2
        Polynomial poly2 = new Polynomial(new int[]{4, 0, 6}); // Represents 4 + 0x + 6x^2
        Polynomial expected = new Polynomial(new int[]{7, 2, 11}); // Represents 7 + 2x + 11x^2
        Polynomial result = Polynomial.add(poly1, poly2);
        assertEquals(0, Polynomial.compare(expected, result));
    }
}