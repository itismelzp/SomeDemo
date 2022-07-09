package com.walker.huawei;

import java.util.Scanner;

public class HJ17 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            String[] sArray = input.split(";");
            int x = 0, y = 0;
            for (String arr : sArray) {
                if (!isLegal(arr)) {
                    continue;
                }
                char direction = arr.charAt(0);
                int step = Integer.parseInt(arr.substring(1));
                switch (direction) {
                    case 'W':
                        y += step;
                        break;
                    case 'S':
                        y -= step;
                        break;
                    case 'A':
                        x -= step;
                        break;
                    case 'D':
                        x += step;
                        break;
                }
            }
            System.out.println(x + "," + y);
        }
    }

    private static boolean isLegal(String str) {
        return str.matches("[WSAD][0-9]{1,2}");
    }
}
