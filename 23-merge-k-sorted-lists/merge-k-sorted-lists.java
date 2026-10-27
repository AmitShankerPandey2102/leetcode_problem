class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         
         if(lists.length==0) return null;
         ArrayList<ListNode> arr = new ArrayList<>();
         for(ListNode n:lists) arr.add(n);
         while(arr.size()>1){
            ListNode a= arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b= arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = merge(a,b);
            arr.add(c);
         }
       return arr.get(0);
    }


    public ListNode merge(ListNode list1, ListNode list2) {

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
