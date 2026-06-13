class Solution {
    public ListNode middleNode(ListNode head) {
        // ListNode temp=head;
        // int cnt=0;
        // while(temp.next!=null){
        //     cnt++;
        // }
        // for(int i=0;i<cnt/2;++i){
        //     head=head.next;
        // }
        // return head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}