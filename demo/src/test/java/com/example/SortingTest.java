package com.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.Arrays; // Add this import

public class SortingTest {

    @Test
    public void testUnsortedArray() {
        int[] arr = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, arr.length);
        System.out.println("Sorted: " + Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, arr.length);
        System.out.println("Sorted: " + Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, arr.length);
        System.out.println("Sorted: " + Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int[] expected = {1, 2, 2, 3, 3, 4, 8};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, arr.length);
        System.out.println("Sorted: " + Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {42};
        int[] expected = {42};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, arr.length);
        System.out.println("Sorted: " + Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        Sorting.selectionSort(arr, arr.length);
        System.out.println("Sorted: " + Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }
}