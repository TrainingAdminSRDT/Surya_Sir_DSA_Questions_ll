class Solution {
    public int maxDepth(TreeNode root) {
        // TreeNode temp=root;
        // int hl=0;
        // int hr=0;
        // TreeNode tempr=root;
        // if(root==null) return 0;
        // while(temp.left!=null){
        //     hl++;
        //     temp=temp.left;
        // }
        // while(tempr!=null){
        //     hr++;
        //     tempr=tempr.right;
        // }
        // int max=Math.max(hl,hr);
        // return max;
        if(root==null) return 0;
        return (1+Math.max(maxDepth(root.left),maxDepth(root.right)));

    }
}