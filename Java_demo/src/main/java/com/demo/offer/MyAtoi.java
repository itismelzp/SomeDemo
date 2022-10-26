package com.demo.offer;

public class MyAtoi {


    public static void main(String[] args) {
        System.out.println(myAtoi("   "));
    }

    public static int myAtoi(String str) {

        int ans = 0;
        int sign = 1;
        int index = 0;
        // 1.空串、“0”串处理
        if (str == null || str.length() == 0) {
            return 0;
        }

        // 2.去除前面空格
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }

        int len = str.length();

        // 3.判断符号
        if (str.charAt(index) == '-' || str.charAt(index) == '+') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // 4.字符转换与溢出处理
        while (index < len) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;
            // 溢出
            if (Integer.MAX_VALUE / 10 < ans
                    || (Integer.MAX_VALUE / 10 == ans && Integer.MAX_VALUE % 10 < digit)) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = 10 * ans + digit;
            index++;
        }
        return sign * ans;
    }
}
