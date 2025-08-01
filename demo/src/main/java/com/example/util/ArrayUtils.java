package com.example.util;

public class ArrayUtils {
    public static void swap(char[] arr, int index, int i) {
        char temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}
