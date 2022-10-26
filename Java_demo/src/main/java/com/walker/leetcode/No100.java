package com.walker.leetcode;

import java.util.Arrays;

public class No100 {

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(top004(nums1, nums2));

        System.out.println(Arrays.toString(nums1) + "," + Arrays.toString(nums2));
    }

    private static double top004(int[] nums1, int[] nums2) {
        int[] temp = nums1;
        nums1 = nums2;
        nums2 = temp;
        return 0;
    }

}
