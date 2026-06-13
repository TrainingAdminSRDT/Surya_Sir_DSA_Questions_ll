class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        // int cntl=0;
        // int cntr=0;
        // TreeNode tempr=root;
        // TreeNode temp=root;
        // while(temp.left!=null){
        //     cntl++;
        // }
        // while(tempr.right!=null){
        //     cntr++;
        // }
        // int ans=cntl+cntr;
        // return ans;
        return (1+countNodes(root.left)+countNodes(root.right));
    }
}