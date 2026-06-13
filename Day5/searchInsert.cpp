#include<iostream>
#include<vector>
using namespace std;
//Problem 35
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        int st = 0, end= nums.size()-1;
        
        while(st <= end){
            int mid = (st + end)/2;
            

            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                st = mid +1;
            }else{
                end = mid -1;
            }
        }
        return st;
    }
};