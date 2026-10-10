
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Stop slow just before the middle
        while (fast.next.next != null &&
               fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        slow.next = slow.next.next;

        return head;
    }
}
