
#169. Majority Element

class Solution:
     def majorityElement(self, nums: list[int]) -> int:
    
        '''l = len(nums) // 2

        for i in nums:
            if nums.count(i) > l:
                return i'''
   
        d = {}

        for i in nums:
            d[i] = d.get(i, 0) + 1

            if d[i] > len(nums) // 2:
                return i