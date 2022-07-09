package com.walker.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;

public class HJ10 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        BitSet set = new BitSet(128);
        for (char c : str.toCharArray()) {
            if (!set.get(c)) {
                set.set(c);
            }
        }
        System.out.println(set.cardinality());
    }

}
