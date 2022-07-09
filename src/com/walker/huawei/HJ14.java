package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class HJ14 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int count = Integer.parseInt(str);
            String[] words = new String[count];

            for (int i = 0; i < count; i++) {
                String str2 = br.readLine();
                words[i] = str2;
            }
            Arrays.sort(words);
            for (int i = 0; i < count; i++) {
                System.out.println(words[i]);
            }
        }
    }
}
