/*
 * Copyright 2021 mararosa
 */
package bubblesortchallenge;

import java.util.Arrays;

/**
 * @author mararosa
 */
public class BubbleSortChallenge {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1 = {4,3,1,2};
        int numSwapReturn = bubbleSort(arr1);
        System.out.format("Array is sorted in %d swaps.", numSwapReturn);
        System.out.println();
        System.out.println("First Element: " + arr1[0]);
        System.out.println("Last Element: " + arr1[arr1.length - 1]);
    }

    public static int bubbleSort(int[] arr) {
        int totalSwaps = 0;
        for (int i = 0; i < arr.length; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    numberOfSwaps++;
                }
            }
            totalSwaps += numberOfSwaps;
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return totalSwaps;
    }

    private static void swap(int[] arr,int firstIndex, int secondIndex) {
        int tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }
}
