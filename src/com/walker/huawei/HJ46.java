package com.walker.huawei;

import java.util.Scanner;

public class HJ46 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            int len = in.nextInt();
            System.out.println(str.substring(0, len));
        }
    }
}
