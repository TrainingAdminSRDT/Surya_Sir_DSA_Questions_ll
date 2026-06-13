              //QUESTION: 141. Linked List Cycle


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
  */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast!= nullptr && fast -> next!= nullptr){
            slow = slow ->next;
            fast = fast ->next ->next;
            if(slow == fast){
                return true;
            }
        

        }
         return false;
    }
};

// my logic:
// class Solution {
// public:
//     bool hasCycle(ListNode *head) {

//         unordered_set<ListNode*> vis;

//         ListNode* t = head;

//         while(t) {

//             if(vis.find(t) != vis.end()) {
//                 return true;
//             }

//             vis.insert(t);
//             t = t->next;
//         }

//         return false;
//     }
// };
