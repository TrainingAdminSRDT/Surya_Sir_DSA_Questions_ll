#222. Count Complete Tree Nodes

from typing import Optional


class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int: # pyright: ignore[reportUndefinedVariable]
        
        if root is None:
            return 0
        
        left = self.countNodes(root.left)
        right = self.countNodes(root.right)
        
        return 1 + left + right