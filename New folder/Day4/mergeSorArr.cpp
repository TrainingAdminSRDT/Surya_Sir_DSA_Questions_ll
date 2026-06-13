#include<iostream>
#include<vector>
using namespace std;
//Problem 88
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        // for(int i=0; i<n; i++){
        //     nums1[m+i] = nums2[i];
        // }
        // sort(nums1.begin(),nums1.end());
        for(int i = m-1, j = n-1,k = m+n-1; ~j; --k){
            nums1[k] = i>0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        
    }
};