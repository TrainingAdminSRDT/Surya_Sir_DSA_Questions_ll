#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n = nums.size();
        for(int i=1;i<n;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
};
int main(){
    vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    Solution sol;
    vector<int> result = sol.runningSum(nums);
    for(int num : result){
        cout << num << " ";
    }
    cout << endl;
    return 0;
}