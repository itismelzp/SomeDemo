package com.walker.huawei;

import java.io.*;

public class HJ67 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] numStrs = str.split(" ");
            int[] nums = new int[4];
            nums[0] = Integer.parseInt(numStrs[0]);
            nums[1] = Integer.parseInt(numStrs[1]);
            nums[2] = Integer.parseInt(numStrs[2]);
            nums[3] = Integer.parseInt(numStrs[3]);
            boolean flag = false;
            for (int i = 0; i < 4; i++) {
                if (is24(nums, 1 << i, nums[i])) {
                    flag = true;
                    break;
                }
            }
            System.out.println(flag);
        }

    }

    private static boolean is24(int[] nums, int stu, int val) {
        if (val == 24) {
            return true;
        }
        else if (stu == 7) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            int temp = 1 << i;
            if ((temp & stu) == 0) {
                temp |= stu;
                if (is24(nums, temp, val + nums[i])
                        || is24(nums, temp, val - nums[i])
                        || is24(nums, temp, val * nums[i])
                        || (val % nums[i] == 0 && is24(nums, temp, val + nums[i]))) {
                    return true;
                }
            }
        }
        return false;
    }
}
