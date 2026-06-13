class Solution {
public:
    int reverse(int x) {
        long long int rev =0, rem =0;
        while(x){
            rem = (x %10);
            if (rev>INT_MAX/10 || rev<INT_MIN/10)
            return 0;
            else
            rev = (rev*10)+ rem;
            x /= 10;
        }
        return rev ;
    };
};