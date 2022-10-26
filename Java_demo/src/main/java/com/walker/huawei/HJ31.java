package com.walker.huawei;

import java.util.Scanner;

public class HJ31 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String line = in.nextLine();
            String[] words = line.split("[^A-Za-z]");
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
