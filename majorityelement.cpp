#include<iostream>
#include<vector>
using namespace std;
//Problem 169
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // sort(nums.begin(), nums.end());
        int count = 0;
        int candidate = 0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count ++;
            }else{
                count --;
            }
        }
        return candidate;
    }
};