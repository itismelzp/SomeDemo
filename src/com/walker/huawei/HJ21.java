package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ21 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息

    /*
    1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) { // 注意 while 处理多个 case

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);
                if (c >= 'A' && c < 'Z') {
                    c = (char) (c + 'b' - 'A');
                } else if (c == 'Z') {
                    c = 'a';
                } else {
                    c = char2Digit(c);
                }
                sb.append(c);
            }
            System.out.println(sb);
        }
    }

    private static char char2Digit(char c) {
        if (c >= 'a' && c <= 'c') {
            c = '2';
        } else if (c >= 'd' && c <= 'f') {
            c = '3';
        } else if (c >= 'g' && c <= 'i') {
            c = '4';
        } else if (c >= 'j' && c <= 'l') {
            c = '5';
        } else if (c >= 'm' && c <= 'o') {
            c = '6';
        } else if (c >= 'p' && c <= 's') {
            c = '7';
        } else if (c >= 't' && c <= 'v') {
            c = '8';
        } else if (c >= 'w' && c <= 'z') {
            c = '9';
        }
        return c;
    }
}
