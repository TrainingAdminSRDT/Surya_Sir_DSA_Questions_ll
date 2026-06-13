#................Leet code solution....................

#509. Fibonacci Number
class Solution(object):
    def fib(self, n):
        if n <= 1:
            return n
        
        a, b = 0, 1
        for _ in range(2, n + 1):
            a, b = b, a + b
        return b

#80. Remove Duplicates from Sorted Array II

class Solution(object):
    def removeDuplicates(self, nums):
        if len(nums) <= 2:
            return len(nums)
        
        k = 2
        
        for i in range(2, len(nums)):
            # If nums[i] differs from nums[k-2], it's safe to keep
            # (at most 2 occurrences allowed)
            if nums[i] != nums[k - 2]:
                nums[k] = nums[i]
                k += 1
        
        return k
        
#258. Add Digits
class Solution(object):
    def addDigits(self, num):
        if num == 0:
            return 0
        dr = num % 9
        return 9 if dr == 0 else dr

#190. Reverse Bits
class Solution(object):
    def reverseBits(self, n):
        result = 0
        for i in range(32):
            bit = (n >> i) & 1
            result |= bit << (31 - i)
        return result
        
#09. Palindrome Number
class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        s = str(x)
        return s == s[::-1]

#26. Remove Duplicates from Sorted Array
class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
                return 0
        i = 0
        for j in range(1, len(nums)):
            if nums[j] != nums[i]:
                i += 1
                nums[i] = nums[j]
        return i + 1

#876. Middle of the Linked List
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def middleNode(self, head):
        slow = fast = head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        return slow

#101. Symmetric Tree
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def isSymmetric(self, root):
        def isMirror(t1, t2):
            if not t1 and not t2:
                return True
            if not t1 or not t2:
                return False
            return (t1.val == t2.val and 
                    isMirror(t1.left, t2.right) and 
                    isMirror(t1.right, t2.left))
    
        if not root:
            return True
        return isMirror(root.left, root.right)

#104. Maximum Depth of Binary Tree
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def maxDepth(self, root):
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
            
#21. Merge Two Sorted Lists
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, list1, list2):

        dummy = ListNode()
        current = dummy

        while list1 and list2:
            if list1.val <= list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        current.next = list1 if list1 else list2

        return dummy.next

#141. Linked List Cycle
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def hasCycle(self, head):
        fast = head
        slow = head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True
        
        return False
        
#206. Reverse Linked List
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def reverseList(self, head):
        prev = None
        curr = head 
        while curr:
            next_node = curr.next  
            curr.next = prev       
            prev = curr            
            curr = next_node       
        return prev

#160. Intersection of Two Linked Lists
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution(object):
    def getIntersectionNode(self, headA, headB):
        if not headA or not headB:
            return None
        pA, pB = headA, headB
        while pA != pB:
            pA = pA.next if pA else headB
            pB = pB.next if pB else headA
        return pA

#912. Sort an Array
class Solution(object):
    def sortArray(self, nums):
        nums.sort()
        return nums
        
56. Merge Intervals
class Solution(object):
    def merge(self, intervals):
        if not intervals:
            return []
        
        intervals.sort(key=lambda x: x[0])
        result = [intervals[0]]
        for i in range(1, len(intervals)):
            if result[-1][1] >= intervals[i][0]:
                result[-1][1] = max(result[-1][1], intervals[i][1])
            else:
                result.append(intervals[i]) 
        return result

#125. Valid Palindrome
class Solution(object):
    def isPalindrome(self, s):
        
        left, right = 0, len(s) - 1
        
        while left < right:
            # Move left pointer until we find an alphanumeric character
            while left < right and not s[left].isalnum():
                left += 1
            # Move right pointer until we find an alphanumeric character
            while left < right and not s[right].isalnum():
                right -= 1
            
            # Compare characters (case-insensitive)
            if s[left].lower() != s[right].lower():
                return False
            
            left += 1
            right -= 1
        
        return True

#58. Length of Last Word
class Solution(object):
    def lengthOfLastWord(self, s):
        s = s.rstrip()
        last_space = s.rfind(' ')
        return len(s) - last_space - 1

#88. Merge Sorted Array 
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        # Start from the end of both arrays
        i = m - 1
        j = n - 1
        k = m + n - 1

        # Merge from the back
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1

        # If there are remaining elements in nums2, copy them
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1

#242. Valid Anagram
class Solution(object):
    def isAnagram(self, s, t):
        
        if len(s) != len(t):
            return False
        
        # Count character frequencies in s
        count = {}
        for char in s:
            count[char] = count.get(char, 0) + 1
        
        # Decrement frequencies using characters from t
        for char in t:
            if char not in count:
                return False
            count[char] -= 1
            if count[char] < 0:
                return False
        
        return True
        
#7. Reverse Integer
class Solution(object):
    def reverse(self, x):
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        sign = 1 if x >= 0 else -1
        x = abs(x)
        
        reversed_num = 0
        
        while x > 0:
            digit = x % 10
            x //= 10
            
            if reversed_num > (INT_MAX - digit) // 10:
                return 0
            
            reversed_num = reversed_num * 10 + digit
        return sign * reversed_num

#344. Reverse String
class Solution(object):
    def reverseString(self, s):
        
        left, right = 0, len(s) - 1
        while left < right:
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1

#35. Search Insert Position
class Solution(object):
    def searchInsert(self, nums, target):
        left, right = 0, len(nums) - 1
        
        while left <= right:
            mid = (left + right) // 2
            
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        
        return left

#704. Binary Search
class Solution(object):
    def search(self, nums, target):
        
        l, r = 0, len(nums) - 1

        while l <= r:

            mid = l + (r - l) // 2

            if nums[mid] >= target:
                r = mid - 1
            else:
                l = mid + 1

        return l if l < len(nums) and nums[l] == target else -1

#977. Squares of a Sorted Array
class Solution(object):
    def sortedSquares(self, nums):
        
        n = len(nums)
        ans = [0] * n
        left, right = 0, n - 1
        
        for pos in range(n - 1, -1, -1):
            if abs(nums[left]) > abs(nums[right]):
                ans[pos] = nums[left] * nums[left]
                left += 1
            else:
                ans[pos] = nums[right] * nums[right]
                right -= 1
        
        return ans 

#27. Remove Element
class Solution(object):
    def removeElement(self, nums, val):
        k = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        return k

#2090.K- Radius Subarray Averages
class Solution(object):
    def getAverages(self, nums, k):
        n = len(nums)
        ans = [-1] * n
        if 2 * k + 1 > n:
            return ans
        
        window_sum = sum(nums[:2 * k + 1])
        ans[k] = window_sum // (2 * k + 1)
        
        for i in range(2 * k + 1, n):
            window_sum += nums[i] - nums[i - (2 * k + 1)]
            ans[i - k] = window_sum // (2 * k + 1)
        
        return ans

#1480. Running Sum of 1d Array
class Solution(object):
    def runningSum(self, nums):
        for i in range(1, len(nums)):
            nums[i] += nums[i - 1]
        return nums

#283. Move Zeroes
class Solution(object):
    def moveZeroes(self, nums):
        last_non_zero = 0
        
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[last_non_zero] = nums[i]
                last_non_zero += 1
        
        for i in range(last_non_zero, len(nums)):
            nums[i] = 0

#53. Maximum Subarray
class Solution(object):
    def maxSubArray(self, nums):
        max_sum = float('-inf')
        current_sum = 0
        
        for num in nums:
            current_sum += num
            max_sum = max(max_sum, current_sum)
            if current_sum < 0:
                current_sum = 0
        
        return max_sum

#169. Majority Element
class Solution(object):
    def majorityElement(self, nums):
        max = None
        count = 0
    
        for i in nums:
            if count == 0:
                max = i
            count += 1 if i == max else -1
        
        return max

#100. Same Tree
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def isSameTree(self, p, q):
        if not p and not q:
            return True

        if not p or not q:
            return False
        if p.val != q.val:
            return False
        return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)

#2574 Left and Right Sum Differences
class Solution(object):
    def leftRightDifference(self, nums):
        n = len(nums)
        leftSum = [0] * n
        rightSum = [0] * n

        for i in range(1, n):
            leftSum[i] = leftSum[i-1] + nums[i-1]

        for i in range(n-2, -1, -1):
            rightSum[i] = rightSum[i+1] + nums[i+1]

        answer = []
        for i in range(n):
            answer.append(abs(leftSum[i] - rightSum[i]))

        return answer
        
#3689. Maximum Number of Coins You Can Get
class Solution(object):
    def maxTotalValue(self, nums, k):
        return k * (max(nums) - min(nums))
        
#643. Maximum Average Subarray I
class Solution(object):
    def findMaxAverage(self, nums, k):
        n = len(nums)
        current_sum = sum(nums[:k])
        max_sum = current_sum
        
        for i in range(k, n):
            current_sum += nums[i] - nums[i - k]
            max_sum = max(max_sum, current_sum)
        
        return max_sum / k