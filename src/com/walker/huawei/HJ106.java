package com.walker.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class HJ106 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String line = in.nextLine();
            char[] words = line.toCharArray();
            int i = 0;
            int j = words.length - 1;
            while (i < j) {
                words[i] ^= words[j];
                words[j] ^= words[i];
                words[i] ^= words[j];
                i++;
                j--;
            }
            for (char word : words) {
                System.out.print(word);
            }
            System.out.println();
        }
    }
}
