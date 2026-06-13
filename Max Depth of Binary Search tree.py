#104. Maximum Depth of Binary Tree

from typing import Optional

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        
        # If tree is empty
        if root is None:
            return 0
        
        # Depth of left subtree
        left_depth = self.maxDepth(root.left)
        
        # Depth of right subtree
        right_depth = self.maxDepth(root.right)
        
        # Return maximum depth
        return max(left_depth, right_depth) + 1   