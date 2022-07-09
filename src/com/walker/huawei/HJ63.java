package com.walker.huawei;

import java.util.*;

public class HJ63 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            int n = scanner.nextInt();
            System.out.println(Solution(str, n));
        }
    }

    public static String Solution(String str, int n) {
        int left = 0, right = 0;
        int start = 0, count = 0, max = 0;
        while (right < str.length()) {
            char c = str.charAt(right++);
            if (c == 'C' || c == 'G') {
                count++;
            }
            if (count > max) {
                max = count;
                start = left;
                // 剪枝
                if (count == n) {
                    return str.substring(start, start + n);
                }
            }
            // 窗口缩小
            if (right - left >= n) {
                char d = str.charAt(left++);
                if (d == 'C' || d == 'G') {
                    count--;
                }
            }
        }
        return str.substring(start, start + n);
    }

}
