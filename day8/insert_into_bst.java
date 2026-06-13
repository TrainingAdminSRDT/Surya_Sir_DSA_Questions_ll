class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // TreeNode curr=new TreeNode(val);
        // TreeNode temp=root;
        // while(temp!=null){
        //     if(temp.left.val>curr.val){
        //         temp.left=curr;
        //     }else{
        //         temp.right=curr;
        //     }
        // }
        // return root;
        // TreeNode temp=root;
        // TreeNode curr=new TreeNode(val);
        // if(temp==null) return curr;
        // temp=(temp.left.val>curr.left.val)?insertIntoBST(temp.left):insertIntoBST(temp.right);
        // return root;
        if(root==null) return new TreeNode(val);
        if(root.val>val){
            root.left=insertIntoBST(root.left,val);
        }else{
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }

}