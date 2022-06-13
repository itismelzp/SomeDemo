public class SwardToOffer {

    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        pHead1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        ListNode node6 = new ListNode(6);
        node2.next = node6;

        ListNode node7 = new ListNode(7);
        node6.next = node7;
        ListNode node8 = new ListNode(8);
        node7.next = node8;


        ListNode pHead4 = new ListNode(4);
        ListNode node5 = new ListNode(6);
        pHead4.next = node5;
        node5.next = node6;

        ListNode ret = FindFirstCommonNode(pHead1, pHead4);
        while(ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }


    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int len1 = 0, len2 = 0;
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        while (head1 != null) {
            len1++;
            head1 = head1.next;
        }
        while (head2 != null) {
            len2++;
            head2 = head2.next;
        }
        if (len1 < len2) {
            forwardByStep(pHead1, len2 - len1);
        } else {
            forwardByStep(pHead2, len1 - len2);
        }
        while (pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
    private static void forwardByStep(ListNode head, int step) {
        if (step <= 0) {
            return;
        }
        while (step-- > 0) {
            head = head.next;
        }
    }

}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

}

