package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ82 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            String[] input = str.split("/");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            if (a > b || a < 1 || b < 2) break;
            while (a != 1) {
                if (b % a == 0) {
                    b = b / a;
                    a = 1;
                    continue;
                }
                if (b % (a - 1) == 0) {
                    System.out.print("1/" + b / (a - 1) + "+");
                    a = 1;
                } else {
                    int c;
                    c = b / a + 1;
                    a = a - b % a;
                    b = b * c;
                    System.out.print("1/" + c + "+");
                }

            }
            System.out.println("1/" + b);
        }
        bf.close();
    }

}
