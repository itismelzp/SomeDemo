package com.demo.sort;

public class Util {

    public static int[] getData() {
        return new int[]{5, 3, 2, 6, 7, 0, 1, 8, 9, 4,
                18, 17, 19, 12, 15, 13, 14, 16, 11, 10};
    }

    public static void swap(int[] input, int i, int j) {
        if (i == j) {
            return;
        }
        input[i] ^= input[j];
        input[j] ^= input[i];
        input[i] ^= input[j];
    }

    public static void swap(char[] input, int i, int j) {
        if (i == j) {
            return;
        }
        input[i] ^= input[j];
        input[j] ^= input[i];
        input[i] ^= input[j];
    }

}
