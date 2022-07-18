package com.gokul.arrays;

import java.util.Arrays;

public class CumulativeSum {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4};



    }

    public static int[] getCumulativeSum(int[] arr) {

        int[] sumArray = new int[arr.length];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumArray[i] = sum;
        }

        return sumArray;
    }


}
