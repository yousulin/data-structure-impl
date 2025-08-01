package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class RecursionTest {

    @Test
    public void testFactorial() {
        assertEquals(1, Recursion.factorial(0));
        assertEquals(1, Recursion.factorial(1));
        assertEquals(2, Recursion.factorial(2));
        assertEquals(6, Recursion.factorial(3));
        assertEquals(24, Recursion.factorial(4));
        assertEquals(120, Recursion.factorial(5));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Recursion.multiply(2, 3));
        assertEquals(0, Recursion.multiply(0, 5));
        assertEquals(-6, Recursion.multiply(-2, 3));
        assertEquals(6, Recursion.multiply(-2, -3));
        assertEquals(15, Recursion.multiply(5, 3));
    }

    @Test
    public void testSumToN() {
        assertEquals(1, Recursion.sumToN(1));
        assertEquals(3, Recursion.sumToN(2));
        assertEquals(6, Recursion.sumToN(3));
        assertEquals(10, Recursion.sumToN(4));
        assertEquals(15, Recursion.sumToN(5));
    }

    @Test
    public void testPermutation() {
        ArrayList<String> ans = new ArrayList<>();// Initialize the list to store permutations
        String str = "abc";
        Recursion.permutation(str, 0, ans);
        assertEquals(Recursion.factorial(str.length()), ans.size()); // 3! = 6 permutations
        assertEquals(true, ans.contains("abc"));
        assertEquals(true, ans.contains("acb"));
        assertEquals(true, ans.contains("bac"));
        assertEquals(true, ans.contains("bca"));
        assertEquals(true, ans.contains("cab"));
        assertEquals(true, ans.contains("cba"));
        System.out.println("Permutations: " + ans);
    }
}