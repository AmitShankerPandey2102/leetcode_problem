class Solution {
    public ListNode middleNode(ListNode head) {
      int count =0;
      ListNode temp=head;
      while(temp!=null){
        temp=temp.next;
        count++;
      }

      temp = head;
      for (int i=0; i<count/2;i++){
        temp=temp.next;
      }  
      // Print middle to last node
        // while (temp != null) {
        //     System.out.print(temp + " ");
        //     temp = temp.next;
        // }

        return temp;
    }
}