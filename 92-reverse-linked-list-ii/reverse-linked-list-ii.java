
class Solution {

    // Reverse method
    public ListNode reverse(ListNode head2) {
        ListNode prev = null;
        ListNode curr = head2;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Main method
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = dummy;

        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }

        ListNode tail1 = temp;
        ListNode head2 = temp.next;

        ListNode tail2 = head2;

        for (int i = 0; i < right - left; i++) {
            tail2 = tail2.next;
        }

        ListNode head3 = tail2.next;

        tail1.next = null;
        tail2.next = null;

        ListNode newHead = reverse(head2);

        tail1.next = newHead;
        head2.next = head3;

        return dummy.next;
    }
}
