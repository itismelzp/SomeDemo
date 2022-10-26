package com.walker.huawei;

import java.util.Scanner;

public class HJ37 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(dp(n));
        }
    }

    public static int dp(int n) {
        int[] num = new int[n + 1];
        num[1] = 1;
        num[2] = 1;
        for (int i = 3; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        return num[n];
    }
}
