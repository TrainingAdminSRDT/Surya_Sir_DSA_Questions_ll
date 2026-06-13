class Solution(object):
    def getAverages(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        n = len(nums)
        ans = [-1]*n
        size = 2*k+1

        if size > n:
            return ans
        
        window_sum = sum(nums[:size])

        ans[k] = window_sum // size

        for i in range(size, n):
            window_sum += nums[i] 
            window_sum -= nums[i - size]

            center = i - k
            ans[center] = window_sum // size

        return ans
    
class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i = 0
        for j in range(len(nums)):
            if nums[j] != val:
                nums[i] = nums[j]
                i += 1

        return i   

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1          # nums1 ke valid elements ka last index
        j = n - 1          # nums2 ka last index
        k = m + n - 1      # nums1 ke end se fill karenge

        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1

        # Agar nums2 me elements bach gaye ho
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1

class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i = 0
        for j in range(len(nums)):
            if nums[j] != val:
                nums[i] = nums[j]
                i += 1

        return i   

class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        l = []
        for i in nums:
            i = i**2
            l.append(i)
            l.sort()
        return l


                                           