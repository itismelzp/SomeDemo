package com.demo.encrypt;

public class XOR {


    public static void main(String[] args) {

        String content = getContent();
        System.out.println("content size: " + content.length());

        long start = System.currentTimeMillis();
        byte[] bytes = encrypt(content.getBytes());//加密
        System.out.println("encrypt time code: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        String str1 = new String(decrypt(bytes));//解密
        System.out.println("decrypt time code: " + (System.currentTimeMillis() - start));
    }

    private static String getContent() {
        StringBuilder content = new StringBuilder("whoislcj");
        for (int i = 0; i < 3000; i++) {
            content.append("whoislcj");
        }
        return content.toString();
    }


    public static byte[] encrypt(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        int len = bytes.length;
        int key = 0x12;
        for (int i = 0; i < len; i++) {
            bytes[i] = (byte) (bytes[i] ^ key);
            key = bytes[i];
        }
        return bytes;
    }

    public static byte[] decrypt(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        int len = bytes.length;
        int key = 0x12;
        for (int i = len - 1; i > 0; i--) {
            bytes[i] = (byte) (bytes[i] ^ bytes[i - 1]);
        }
        bytes[0] = (byte) (bytes[0] ^ key);
        return bytes;
    }

}
