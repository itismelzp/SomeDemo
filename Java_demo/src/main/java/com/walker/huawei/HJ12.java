package com.walker.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ12 {
    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bf.readLine()) != null) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.println(sb.reverse());
        }
    }
}
