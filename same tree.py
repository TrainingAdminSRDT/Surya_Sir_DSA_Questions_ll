#100. Same Tree
class Solution:
    def isSameTree(self, p, q):
        # Both nodes are None
        if not p and not q:
            return True

        # One is None and the other is not
        if not p or not q:
            return False

        # Values are different
        if p.val != q.val:
            return False

        # Check left and right subtrees
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)