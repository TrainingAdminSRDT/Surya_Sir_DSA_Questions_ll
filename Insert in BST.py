#701. Insert into a Binary Search Tree

class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]: # pyright: ignore[reportUndefinedVariable]

        if not root:
            return TreeNode(val) # pyright: ignore[reportUndefinedVariable]

        if val < root.val:
            root.left = self.insertIntoBST(root.left, val)
        else:
            root.right = self.insertIntoBST(root.right, val)

        return root