class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode i = list1;
        ListNode j = list2;

        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                k.next = list1;
                list1 = list1.next;
            } else {
                k.next = list2;
                list2 = list2.next;
            }

            k = k.next;
        }

        if (list1 == null) {
            k.next = list2;
        } else {
            k.next = list1;
        }

        return dummy.next;
    }
}