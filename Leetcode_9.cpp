class Solution {
public:
    bool isPalindrome(int x) {
        int temp=x, rem, rev;
        while(x>0){
            rem = x%10;
            x /= 10;
            if (rev > INT_MAX/10 || rev <INT_MIN/10)
            return 0;
            else
            rev = (rev*10)+rem;
        }
        if (temp==rev)
        return true;
        else
        return false;
    }
};