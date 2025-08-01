package com.example;

import java.util.Arrays;

public class Searching {
    public static int binarySearch(int[] list, int searchnum) {
        if (list == null || list.length == 0) {
            return -1; // Handle null or empty array
        }
        int left = 0;
        int right = list.length - 1;
        int middle;
        while(left <= right) {
            middle = left + (right - left) / 2; // Avoid potential overflow
            // int middle = (left + right) / 2; // This can cause overflow
            // if (left + right) exceeds Integer.MAX_VALUE, it will overflow
            if(searchnum < list[middle]){
                right = middle - 1;
            }else if(searchnum == list[middle]){
                return middle; // Found the element
            }else{
                left = middle + 1;
            }
        }
        return -1; // Element not found
    }

    public static int selectKthLargest(int[] arr, int k) {
        if (arr == null || arr.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Sort the array in descending order
        Arrays.sort(arr);
        return arr[k - 1]; // Return the k-th largest element
    }
}