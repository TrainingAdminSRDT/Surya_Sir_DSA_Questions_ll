class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        count=0
        for i in s[::-1]:

            if i!=" ":
                count+=1
            if i==" " and count>0:
                return count
            else:
                pass
        return count
        