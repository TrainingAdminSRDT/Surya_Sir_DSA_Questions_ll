//program 1 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head ;
        ListNode temp = dummy ;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;

            }
           else{ 
            temp= temp.next;
            } 

        }return dummy.next ;
    }
}

//Program-2
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast != null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        ListNode prev = null ;
        while(slow!= null){
            ListNode nextNode = slow.next ;
           slow.next = prev ;
           prev = slow ;
           slow = nextNode ;
        }
        ListNode left = head ;
        ListNode right = prev ;
       while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
              }

        return true;
        }

}
//Program-3
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */



public class Solution {
    public boolean hasCycle(ListNode head) {

    ListNode slow = head ;
    ListNode fast = head ;
    while(fast!= null && fast.next!= null){
        slow = slow.next ;
        fast = fast.next.next;
        if(slow==fast){
            return true ;
        }
    }
    return false;
    }
}




//Program-4
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

//Program-5
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}

//Program 6
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
     

     if(p == null && q == null){
        return true ;

     }
     if(p == null || q == null){
        return false ;
     }
     if(p.val != q.val){
        return false ;
        
     }
     return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }
}

//Program 7
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        
        // Dono null hain
        if (left == null && right == null) {
            return true;
        }

        // Ek null hai, dusra nahi
        if (left == null || right == null) {
            return false;
        }

        // Values same honi chahiye
        if (left.val != right.val) {
            return false;
        }

        // Mirror check
        return isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}





















