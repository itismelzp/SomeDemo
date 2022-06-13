package com.demo.offer;

import com.demo.sort.Util;

public class OfferDemo {


    public static void main(String[] args) {

//        System.out.println(Algorithm.findNthDigit(999));

        System.out.println(reverse("nowcoder. a am I", ' '));
        System.out.println(reverse("nowcoder. a", ' '));
        System.out.println(reverse("www.toutiao.cn", '.'));
    }


    private static String reverse(String str, char split) {
        int start = 0;
        int end;
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (i == chs.length - 1) {
                end = i;
                swap(chs, start, end);
            } else if (split == chs[i]) {
                end = i - 1;
                swap(chs, start, end);
                start = i + 1;
            }
        }
        swap(chs, 0, chs.length - 1);
        return new String(chs);
    }

    private static void swap(char[] chs, int lo, int hi) {
        while (lo < hi) {
            Util.swap(chs, lo++, hi--);
        }
    }

}
