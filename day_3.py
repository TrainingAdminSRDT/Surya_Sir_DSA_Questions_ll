class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
       
        for i in range(1 , len(nums)):
            nums[i] = nums[i] + nums[i-1]
           
        return nums
    
class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
       
        for i in range(1 , len(nums)):
            nums[i] = nums[i] + nums[i-1]
           
        return nums

class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        sum = 0
        for i in range(0,k):
            sum += nums[i]
        maxsum = sum    
        for j in range(k,len(nums)):
            sum += nums[j] - nums[j-k]
            maxsum = max(maxsum,sum)
            
        return float(maxsum/k)  
    
            