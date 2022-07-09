package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ102 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            char[] chs = str.toCharArray();
            int[] asci = new int[129];
            for (char ch : chs) {
                asci[ch]++;
            }
            int max = 0;
            for (int j : asci) {
                if (max < j) {
                    max = j;
                }
            }
            StringBuilder sb = new StringBuilder();
            while (max > 0) {
                for (int i = 0; i < asci.length; i++) {
                    if (asci[i] == max) {
                        sb.append((char) i);
                    }
                }
                max--;
            }
            System.out.println(sb);
        }
    }
}
