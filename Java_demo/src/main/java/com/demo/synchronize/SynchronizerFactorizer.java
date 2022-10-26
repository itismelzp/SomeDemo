package com.demo.synchronize;

import java.math.BigInteger;

public class SynchronizerFactorizer {

    private BigInteger lastNumber;
    private BigInteger[] lastFactors;

    public synchronized void service(String req) {
        BigInteger i = extractFromRequest(req);
        if (i.equals(lastNumber)) {
            encodeIntoResponse(lastFactors);
            System.out.println("from catch req: " + req);
        } else {
            BigInteger[] factors = factor(i);
            lastNumber = i;
            lastFactors = factors;
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
