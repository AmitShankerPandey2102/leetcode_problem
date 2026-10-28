class Solution {
    public ListNode swapNodes(ListNode head, int k) {
          ListNode curr = head;
          for(int i=1;i<k;i++){          // loop chalo aur pahla node nikal lo 
            curr = curr.next;
          }

          ListNode a = curr;    // pahle wale node ko curr me save kar lo
          ListNode b = head;
          while(curr!=null && curr.next!=null){
            curr=curr.next;     // b aur curr as a slow and fast pointer kaam kar rahe jisese hum last node from the end bhi nikal rahe 
            // b as a slowpointer and curr jo kii already k se aage chal raha wah work karega as a fast pointer
            b=b.next;
          }

          int temp = a.val;  // ab temp me a ki value save kar lo aur swap kar b wale value se ....
          a.val=b.val;
          b.val=temp;
          return head;
    }
}