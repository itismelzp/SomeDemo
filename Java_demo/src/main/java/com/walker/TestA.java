package com.walker;

import java.util.Arrays;

public class TestA {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 2, 4, 5, 9, 7};
        int l = 0;
        int r = arr.length - 1;
        System.out.println(Arrays.toString(qSort(arr, l, r)));
    }

    // nlogn
    private static int[] qSort(int[] arr, int l, int r) {

        // 6 3 2 4 5 9 7
        int first = l;
        int last = r;
        int pivot = arr[first];
        while (first < last) {
            while (first < last && arr[last] >= pivot) {
                --last;
            }
            arr[first] = arr[last];
            while (first < last && arr[first] < pivot) {
                ++first;
            }
            arr[last] = arr[first];
        }
        arr[first] = pivot;
        if (first > l) {
            qSort(arr, l, first);
        }
        if (r > first + 1) {
            qSort(arr, first + 1, r);
        }
        return arr;
    }

}
