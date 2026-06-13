//141. Linked List Cycle

class Solution {
public:
    bool hasCycle(ListNode *head) {
     class Solution:
   
      fast=head;
      slow=head;
      while (fast && fast->next)
      {
        slow=slow->next ->next;
        if(slow==fast)
        return True;

      }   
    
    return False   
    }
};