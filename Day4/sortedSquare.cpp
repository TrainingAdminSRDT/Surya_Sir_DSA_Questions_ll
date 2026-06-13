#include<iostream>
#include<vector>
using namespace std;
//Problem 977
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        // int k = 0;
        // for(int i = 0; i<nums.size(); i++){
        //     nums[k] = pow(nums[i], 2);
        //     k++;
        
        // }
        // sort(nums.begin(), nums.end());
        // return nums;
        
        int n = nums.size();
        vector<int> result(n);

        int l = 0;
        int r = n-1;
        int i = n -1;

        while(l <= r){
            int lS = nums[l] * nums[l];
            int rS = nums[r] * nums[r];

            if(lS > rS){
                result[i] = lS;
                l++;
            } else{
                result[i] = rS;
                r--;
            }
            i--;
        }
       return result;
        
    }
};