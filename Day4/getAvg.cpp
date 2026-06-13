#include<iostream>
#include<vector>
using namespace std;
//Problem 2090
class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> avgs(n, -1);
         
        long long window_size = 2 * k +1;
        if(n < window_size){
            return avgs;
        }
        long long currWindow_sum = 0;

        for(int i = 0; i<window_size; i++){
            currWindow_sum += nums[i];
        }
        avgs[k] = currWindow_sum / window_size;

        for(int i = window_size; i<n; ++i){
            currWindow_sum += nums[i] - nums[i-window_size];

            avgs[i-k] = currWindow_sum / window_size;
        }

        return avgs;

       
        

        
    }
};