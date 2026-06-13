#include<iostream>
#include<vector>
using namespace std;
//Problem 1480
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        for(int i = 1; i< nums.size(); i++){
            nums[i] += nums[i-1];
        }
        return nums;

        
    }
};