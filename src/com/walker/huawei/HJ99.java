package com.walker.huawei;

import java.io.*;

public class HJ99 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            int count = 0;
            for (int i = 0; i <= n; i++) {
                int temp = i;
                int j = 1;
                while (temp != 0) {
                    temp = temp / 10;
                    j = j * 10;
                }
                if ((i * i - i) % j == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
