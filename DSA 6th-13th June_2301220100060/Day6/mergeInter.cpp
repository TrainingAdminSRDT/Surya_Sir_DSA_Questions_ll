#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
//Problem 56
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n = intervals.size();
        sort(intervals.begin(), intervals.end());
        int st = intervals[0][0];
        int end = intervals[0][1];
        vector<vector<int>> ans;
        for(int i = 1; i<n; ++i){
            if(end < intervals[i][0]){
                ans.push_back({st, end}); 
                st = intervals[i][0];
                end = intervals[i][1];
            }else{
               end = max(end, intervals[i][1]);
            }
        }
        ans.push_back({st, end});
        return ans;
        
    }
};