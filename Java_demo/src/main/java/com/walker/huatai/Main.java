package com.walker.huatai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            int t = in.nextInt();

            String[] words = new String[t];
            for (int i = 0; i < t; i++) {
                words[i] = in.next();
            }

            for (String word : words) {
                int cnt = 0;
                char preChar = ' ';
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (j == 0) {
                        if (isUppercase(c)) {
                            cnt += 2;
                        } else {
                            cnt += 1;
                        }
                    } else {
                        if (isSameCase(c, preChar)) {
                            cnt += 1;
                        } else {
                            cnt += 2;
                        }
                    }

                    preChar = c;
                }
                System.out.println(cnt);
            }
        }
    }

    private static boolean isSameCase(char a, char b) {
        return (isUppercase(a) && isUppercase(b)) || (isLowerCase(a) && isLowerCase(b));
    }

    private static boolean isUppercase(char a) {
        return 'A' <= a && a <= 'Z';
    }

    private static boolean isLowerCase(char a) {
        return 'a' <= a && a <= 'z';
    }
}
