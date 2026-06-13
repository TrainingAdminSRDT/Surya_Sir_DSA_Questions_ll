// Add digits
class Solution {
public:
    int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
};
//  Reverse Integer
class Solution {
public:
    int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            
            // Check for positive overflow
            if (rev > INT_MAX / 10 || (rev == INT_MAX / 10 && pop > 7)) {
                return 0;
            }
            // Check for negative underflow
            if (rev < INT_MIN / 10 || (rev == INT_MIN / 10 && pop < -8)) {
                return 0;
            }
            
            rev = rev * 10 + pop;
        }
        return rev;
    }
};

// Palindrome number
class Solution {
public:
    bool isPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfies this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNum = 0;
        while (x > reversedNum) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by reversedNum / 10
        // For example when x = 12321, at the end of the while loop we get x = 12, reversedNum = 123,
        // since the middle digit doesn't matter in palindrome, we can simply get rid of it.
        return x == reversedNum || x == reversedNum / 10;
    }
};