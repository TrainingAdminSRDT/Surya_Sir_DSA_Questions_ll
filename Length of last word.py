
#58. Length of Last Word

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        word=s.split()[-1]
        length=len(word)
        return length