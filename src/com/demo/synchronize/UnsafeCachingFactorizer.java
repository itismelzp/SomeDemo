package com.demo.synchronize;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class UnsafeCachingFactorizer {

    private final AtomicReference<BigInteger> lastNumber
            = new AtomicReference<>();
    private final AtomicReference<BigInteger[]> lastFactors
            = new AtomicReference<>();

    public void service(String req) {
        BigInteger i = extractFromRequest(req);
        if (i.equals(lastNumber.get())) {
            encodeIntoResponse(lastFactors.get());
            System.out.println("from catch req: " + req);
        } else {
            BigInteger[] factors = factor(i);
            lastNumber.set(i);
            lastFactors.set(factors);
            encodeIntoResponse(factors);
            System.out.println("not from catch req: " + req);
        }
    }

    private BigInteger extractFromRequest(String req) {
        return new BigInteger(req);
    }

    private void encodeIntoResponse(BigInteger[] integers) {
//        System.out.println("[encodeIntoResponse] integers: " + Arrays.toString(integers));
    }

    private BigInteger[] factor(BigInteger integer) {
        String ss = integer.toString();
        int length = ss.length();
        BigInteger[] ans = new BigInteger[length];
        for (int i = 0; i < length; i++) {
            ans[i] = new BigInteger(ss.charAt(i) + "");
        }
        return ans;
    }
}
