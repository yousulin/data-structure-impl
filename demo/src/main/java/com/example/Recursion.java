package com.example;

import java.util.ArrayList;

import com.example.util.ArrayUtils;

public class Recursion {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
        if (n == 0 || n == 1) {
            return 1; // Base case
        }else{
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static int multiply(int a, int b) {
        // Handle negative b
        if (b < 0) {
            return -multiply(a, -b); // Handle negative b
            // if b is negative, condition b == 1 will not be met, 
            // which will lead to infinite recursion
        }
        if (b == 1) {
            return a; // Base case
        } else {
            return a + multiply(a, b - 1); // Recursive case
        }
    }
    // sum of integers from 1 to n
    public static int sumToN(int n) {
        if(n == 1) {
            return 1; // Base case
        } else {
            return n + sumToN(n - 1);
        }
    }

    public static void permutation(String str, int index, ArrayList<String> ans) {
        char[] arr = str.toCharArray();
        if (arr.length == 0) {
            return;
        }
        if (index == arr.length - 1) {
            // If we have reached the end of the string, add the current permutation to the list
            // Convert char array back to string and add to the list
            ans.add(new String(arr));
            System.out.println("Adding permutation: " + new String(arr));
            return; // Base case
        }else{
            for (int i = index; i < arr.length; i++) {
                // By swapping each character to current position (index),　藉由將每個字元交換到當前位置 (index)，
                // we can generate all permutations of the string　可以生成字串的所有排列組合
                ArrayUtils.swap(arr, index, i);

                // Recur for the next index　對下一個索引進行遞迴
                permutation(new String(arr), index + 1, ans); 

                // After recursion, swap back to restore original order
                // This is necessary to ensure that the next iteration
                // starts with the original string
                ArrayUtils.swap(arr, index, i);
            }
        }
    }
}