package com.walker.huawei;


import java.util.Scanner;

public class HJ51 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            ListNode header = new ListNode();
            for (int i = 0; i < num; i++) {
                int value = scan.nextInt();
                header.next = new ListNode(value, header.next);
            }
            int target = scan.nextInt();
            for (int i = 0; i < target; i++) {
                header = header.next;
            }
            System.out.println(header.value);
        }
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

}
