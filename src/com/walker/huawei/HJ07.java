package com.walker.huawei;

import java.util.Scanner;

public class HJ07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            double a = in.nextDouble();
            System.out.println((int) (a + 0.5));
        }
    }
}
