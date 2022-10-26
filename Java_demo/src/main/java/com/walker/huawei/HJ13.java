package com.walker.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ13 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] words = str.trim().split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i]);
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
