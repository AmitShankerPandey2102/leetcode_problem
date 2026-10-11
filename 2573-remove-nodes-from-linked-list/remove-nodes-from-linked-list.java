class Solution {
    public ListNode removeNodes(ListNode head) {

        // Step 1: Reverse the linked list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        // Step 2: Remove nodes smaller than the maximum so far
        int max = head.val;
        curr = head;

        while (curr.next != null) {
            if (curr.next.val < max) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr.val;
            }
        }

        // Step 3: Reverse again to restore original order
        prev = null;
        curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}