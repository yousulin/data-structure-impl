package com.example;
import org.junit.Test;

public class SearchingTest {

    @Test
    public void testSortedArray() {
        // The input array for binary search should be sorted.
        int[] arr = {1, 2, 3, 5, 8};
        int searchnum = 3;
        int result = Searching.binarySearch(arr, searchnum);
        if(result != -1) {
            System.out.println("Element " + searchnum + " found at index: " + result);
        } else {
            System.out.println("Element " + searchnum + " not found in the array.");
        }
    }

    @Test
    public void testPotentialOverflow() {
        int left = Integer.MAX_VALUE - 1; // 2147483646
        int right = Integer.MAX_VALUE;    // 2147483647
        int[] arr = {left, right};
        int searchnum = right;
        int result = Searching.binarySearch(arr, searchnum);
        if(result != -1) {
            System.out.println("Element " + searchnum + " found at index: " + result);
        } else {
            System.out.println("Element " + searchnum + " not found in the array.");
        }
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int searchnum = 5;
        int result = Searching.binarySearch(arr, searchnum);
        if(result != -1) {
            System.out.println("Element " + searchnum + " found at index: " + result);
        } else {
            System.out.println("Element " + searchnum + " not found in the array.");
        }
    }

    @Test
    public void testSelectKthLargest() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int k = 3; // We want the 3rd largest element
        int result = Searching.selectKthLargest(arr, k);
        System.out.println("The " + k + "rd largest element is: " + result);
    }
}