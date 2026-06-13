class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=null;
        ListNode temp=curr;
        while(list1.next!=null && list2.next!=null){
            if(list1.val>list2.val){
                curr.next=list2.val;
            }else{
                curr.next=list1.val;
            }
            curr=curr.next;
            list1=list1.next;
            list2=list2.next;
        }
        if(list1!=null){
            curr.next=list1;
        }
        if(list2!=null){
            curr.next=list2;
        }
        return temp.next;
    }
}