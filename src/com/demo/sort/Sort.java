package com.demo.sort;

import java.util.Arrays;

/**
 * 参考：https://www.cnblogs.com/guoyaohua/p/8600214.html
 */
public class Sort {

    // Heap Sort
    static int[] heapSort(int[] array) {

        int hi = array.length - 1;
        if (hi <= 1) {
            return array;
        }
        // 1.构建一个最大堆，从最后一个非叶子节点开始向上构造最大堆
        for (int i = hi / 2; i >= 0; i--) {
            adjustHeap(array, i, hi + 1);
        }

        // 2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
        for (int i = hi; i >= 0; i--) {
            Util.swap(array, 0, i);
            adjustHeap(array, 0, i);
        }

        return array;
    }

    // 调整使之成为最大堆
    private static void adjustHeap(int[] array, int i, int hi) {
        int maxIndex = i;
        // 如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 < hi && array[i * 2] > array[maxIndex]) {
            maxIndex = i * 2;
        }
        // 如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 1 < hi && array[i * 2 + 1] > array[maxIndex]) {
            maxIndex = i * 2 + 1;
        }
        // 如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            Util.swap(array, maxIndex, i);
            adjustHeap(array, maxIndex, hi);
        }
    }

    // Quick sort
    static int[] quickSort(int[] input, int lo, int hi) {
        if (lo >= hi) {
            return input;
        }
        int first = lo;
        int last = hi;
        int pivot = input[first];
        while (first < last) {
            while (first < last && pivot < input[last]) {
                --last;
            }
            input[first] = input[last];
            while (first < last && input[first] < pivot) {
                ++first;
            }
            input[last] = input[first];
        }
        input[first] = pivot;
        quickSort(input, lo, first - 1);
        quickSort(input, first + 1, hi);
        return input;
    }

    // Merge sort
    static int[] mergeSort(int[] input) {
        if (input == null || input.length < 2) {
            return input;
        }
        int mid = input.length >> 1;
        int[] left = Arrays.copyOfRange(input, 0, mid);
        int[] right = Arrays.copyOfRange(input, mid, input.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int k = 0, i = 0, j = 0; k < result.length; k++) {
            if (i >= left.length) {
                result[k] = right[j++];
            } else if (j >= right.length) {
                result[k] = left[i++];
            } else if (left[i] > right[j]) {
                result[k] = right[j++];
            } else {
                result[k] = left[i++];
            }
        }
        return result;
    }


    // Insertion sort
    static int[] insertionSort(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int cnt = 0;
        for (int i = 0; i < input.length - 1; i++) {
            int cur = input[i + 1];
            int preIdx = i;
            cnt++;
            while (preIdx >= 0 && cur < input[preIdx]) {
                input[preIdx + 1] = input[preIdx];
                --preIdx;
            }
            input[preIdx + 1] = cur;
        }
        System.out.println("insertionSort cnt: " + cnt);
        return input;
    }

    // Selection sort
    static int[] selectionSort(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int cnt = 0;
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for (int j = i; j < input.length; j++) {
                cnt++;
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            Util.swap(input, minIndex, i);
        }
        System.out.println("selectionSort cnt: " + cnt);
        return input;
    }

    // bubble sort
    static int[] bubbleSort(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int len = input.length;
        int cnt = 0; // record compare times
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                cnt++;
                if (input[j] > input[j + 1]) {
                    Util.swap(input, j, j + 1);
                }
            }
        }
        System.out.println("bubbleSort cnt: " + cnt);
        return input;
    }

    // bubble sort2
    static int[] bubbleSort2(int[] input) {
        int len = input.length;
        int cnt = 0; // record compare times

        for (int i = 0; i < len; i++) {
            boolean isSorted = true;
            for (int j = 0; j < len - i - 1; j++) {
                cnt++;
                if (input[j] > input[j + 1]) {
                    Util.swap(input, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println("bubbleSort2 cnt: " + cnt);
        return input;
    }

    // bubble sort3
    static int[] bubbleSort3(int[] input) {
        int len = input.length;
        int cnt = 0; // record compare times
        int k;
        int last = len;
        for (int i = 0; i < len; i++) {
            k = last;
            for (int j = 1; j < k; j++) {
                cnt++;
                if (input[j - 1] > input[j]) {
                    Util.swap(input, j - 1, j);
                    last = j;
                }
            }
            if (k == last) {
                break;
            }
        }
        System.out.println("bubbleSort3 cnt: " + cnt);
        return input;
    }
}
