class Solution:
    def addDigits(self, num):
        if num == 0:
            return 0
        return 1 + (num - 1) % 9
    

class Solution:
    def reverse(self, x):
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

        sign = -1 if x < 0 else 1
        x = abs(x)

        rev = 0

        while x != 0:
            digit = x % 10
            x //= 10

            # Overflow check
            if rev > (INT_MAX - digit) // 10:
                return 0

            rev = rev * 10 + digit

        return sign * rev
    
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