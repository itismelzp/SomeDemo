package com.walker.huawei;

import java.util.Scanner;

public class HJ34 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            char[] chs = new char[128];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                chs[c]++;
            }
            for (int i = 0; i < 128; i++) {
                while (chs[i] > 0) {
                    System.out.print((char) i);
                    chs[i]--;
                }
            }
        }
    }
}
