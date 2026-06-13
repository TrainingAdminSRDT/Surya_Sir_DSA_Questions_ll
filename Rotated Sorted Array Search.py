
#33. Search in Rotated Sorted Array
class Solution:
    def search(self, nums: list[int], target: int) -> int:
        for i in range(0,len(nums)):
            if(nums[i]==target):
                return i
            else :
                return -1