/*
 * Copyright 2021 mararosa
 */
package solution;

import java.util.Scanner;

/**
 * @author mararosa
 */
public class Solution {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int numSwapReturn = bubbleSort(a);

        System.out.format("Array is sorted in %d swaps.", numSwapReturn);
        System.out.println();
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

    }

    public static int bubbleSort(int arr[]) {
        int numberOfSwaps = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    numberOfSwaps++;
                }
            }
        }
        return numberOfSwaps;
    }
}
