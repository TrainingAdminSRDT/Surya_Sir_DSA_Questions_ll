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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        // if (headA == null || headB == null)
        //     return null;
        ListNode *pA=headA;
        ListNode *pB= headB;
        while (pA!=pB){
            pA = pA?pA->next:headA;
            pB = pB?pB->next:headB;
        }    
       return pA;
        }
    };