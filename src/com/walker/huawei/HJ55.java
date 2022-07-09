package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ55 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bufferedReader.readLine()) != null) {
            int count = 0;
            int num = Integer.parseInt(input);
            for (int i = 7; i <= num; i++) {
                if (i % 7 == 0 || contain7(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean contain7(int n) {
        while (n > 0) {
            if (n % 10 == 7) {
                return true;
            } else {
                n /= 10;
            }
        }
        return false;
    }

}
