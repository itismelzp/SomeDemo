package com.demo.sort;

import java.util.Arrays;

public class SortDemo {

    public static void main(String[] args) {

        // 参考：https://www.cnblogs.com/guoyaohua/p/8600214.html

        // bubbleSort
        System.out.println("bubbleSort: ");
        System.out.println(Arrays.toString(Sort.bubbleSort(Util.getData())));
        System.out.println(Arrays.toString(Sort.bubbleSort2(Util.getData())));
        System.out.println(Arrays.toString(Sort.bubbleSort3(Util.getData())));

        // selectionSort
        System.out.println("selectionSort: ");
        System.out.println(Arrays.toString(Sort.selectionSort(Util.getData())));

        // insertionSort
        System.out.println("insertionSort: ");
        System.out.println(Arrays.toString(Sort.insertionSort(Util.getData())));

//         insertionSort
//        System.out.println("insertSort2: ");
//        System.out.println(Arrays.toString(Sort.insertSort2(Util.getData())));

        // mergeSort
        System.out.println("mergeSort: ");
        System.out.println(Arrays.toString(Sort.mergeSort(Util.getData())));

        // quickSort
        System.out.println("quickSort: ");
        int[] data = Util.getData();
        System.out.println(Arrays.toString(Sort.quickSort(Util.getData(), 0, data.length - 1)));

        // heapSort
        System.out.println("heapSort: ");
        System.out.println(Arrays.toString(Sort.heapSort(Util.getData())));
    }

}
