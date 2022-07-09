package com.walker;

import java.io.*;

public class FindOmitName {

    public static void main(String[] args) {

        String dir = "/Users/walkerzpli/IdeaProjects/javaDemo/data/";
        String fileName1 = "名单1";
        String fileName2 = "名单2";
        String data1 = dir + fileName1;
        String data2 = dir + fileName2;
        String result1 = getRetName(dir, fileName1, fileName2);
        String result2 = getRetName(dir, fileName2, fileName1);

        inLeftNoInRight(data1, data2, result1);
        inLeftNoInRight(data2, data1, result2);
    }

    private static String getRetName(String dir, String fileName1, String fileName2) {
        return dir + String.format("在%s中，不在%s中.txt", fileName1, fileName2);
    }

    private static void inLeftNoInRight(String data1, String data2, String result) {
        File file1 = new File(data1);
        File file2 = new File(data2);
        File retFile = new File(result);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        BufferedWriter writer = null;
        try {
            reader1 = new BufferedReader(new FileReader(file1));
            reader2 = new BufferedReader(new FileReader(file2));
            writer = new BufferedWriter(new FileWriter(retFile));


            reader1.mark((int) file1.length());
            reader2.mark((int) file2.length());

            String tempStr;
            while ((tempStr = reader1.readLine()) != null) {
                sb1.append(tempStr).append(",");
            }
            System.out.println(sb1);
            System.out.println();
            while ((tempStr = reader2.readLine()) != null) {
                sb2.append(tempStr).append(",");
            }
            System.out.println(sb2);
            System.out.println();

            reader1.reset();
            reader2.reset();
            while ((tempStr = reader1.readLine()) != null) {
                if (!sb2.toString().contains(tempStr)) {
                    System.out.println(tempStr);
                    writer.write(tempStr + "\n");
                }
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader1 != null) {
                    reader1.close();
                }
                if (reader2 != null) {
                    reader2.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
