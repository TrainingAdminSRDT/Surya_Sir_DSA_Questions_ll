#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    typedef long long ll;
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        ll sum = 0;
        ll maxi = LONG_MIN;

        for(int i=0;i<n;i++){
            sum += nums[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return maxi;
    }
};
int main(){
    vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    Solution sol;
    cout << sol.maxSubArray(nums) << endl;
    return 0;
}