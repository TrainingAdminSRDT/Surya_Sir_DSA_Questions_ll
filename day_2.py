class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        m = 0

        for i in nums:
            if count == 0:
                m = i

            if i == m:
                count += 1
            
            else:
                count -= 1
            
        return m
    
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        currsum = nums[0]
        maxsum = nums[0]
        for i in range(1 , len(nums)):
            currsum = max(nums[i] , currsum + nums[i])
            maxsum = max(currsum , maxsum)

        return maxsum

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        for i in nums:
            if i == 0:
                nums.remove(0)
                nums.append(0)
            else:
                continue
                return nums    