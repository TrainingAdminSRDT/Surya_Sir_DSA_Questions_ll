#258. Add Digits

class Solution:
    def addDigits(self, num: int) -> int:
        num = 38
        sum=0
        while (num!=0):
            x=num%10
            sum=sum+x
            num=num//10
        return sum