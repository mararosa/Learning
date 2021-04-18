/*
 * Copyright 2021 mararosa
 */

package googlecodejam;

import java.util.Arrays;

/**
 * @author mararosa
 */

public class GoogleCodeJam {

    public static int sortArray(int[] arr) {
        int totalTreats = 0;
        int treat = 1;
        int min;
        int max = 0;
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                treat+= 1;
                arr[i] = max;
            }
            totalTreats+= treat;
        }
        System.out.println("Total treats: " + totalTreats);
        
        
        return totalTreats;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int array1[] = {10,20,10,25};
        int array2[] = {7,7,7,7};
        sortArray(array2);
    }

}
