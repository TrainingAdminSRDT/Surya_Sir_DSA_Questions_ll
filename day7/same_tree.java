class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // TreeNode temp=p;
        // TreeNode tempr=q;
        // if(p==null || q==null) return false;
        // while(p.left!=null && q.left!=null){
        //     if(p.val!=q.val) return false;
        //     p=p.left;
        //     q=q.left;
        // }
        //  while(p.right!=null && q.right!=null){
        //     if(p.val!=q.val) return false;
        //     p=p.right;
        //     q=q.right;
        // }
        // return true;

        if(p==null && q==null) return true;
        if(p==null || q==null || p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}