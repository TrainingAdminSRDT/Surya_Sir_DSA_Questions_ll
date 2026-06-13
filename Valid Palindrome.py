#125. Valid Palindrome

class Solution:
    def isPalindrome(self, s: str) -> bool:
        rev=0
        lr=s.lower()
        while(lr>0):
            rem=lr%10
            rev=rem*10+rev
            lr=lr//10
        if (lr==s):
            return True 