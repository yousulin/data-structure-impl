package com.example;
public class Sorting {
    public static void selectionSort(int[] list, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            // 和陣列中在自己之後的數字做比較
            // 找出比自己小且最小數字所在的index
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            // Swap list[i] and list[min]
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }
    public static void quickSort(int[] list, int n) {

    }
}