

//Day -1
 //Program 1 (Leetcode 258)
class Solution {
    public int addDigits(int num) {
        if(num == 0 ){
            return 0 ;

        }
        else if((num % 9) == 0 ){
            return 9 ;
        }
        else return num % 9 ;
}
}

// Program -2
// Leetcode - 7 Reverse Integer
class Solution {
    public int reverse(int x) {
        long rev = 0;

        while (x != 0) {
            int d = x % 10;
            rev = rev * 10 + d;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

         return (int)rev;
    }
}