class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        if (k == 0) {
            return head;
        }

        int len = 0;
        ListNode temp = head;
        ListNode tail = null;

        while (temp != null) {
            tail = temp;
            temp = temp.next;
            len++;
        }

        k = k % len;

        if (k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode a = slow.next;
        slow.next = null;
        tail.next = head;

        return a;
    }
}