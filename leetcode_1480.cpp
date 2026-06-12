class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n = size(nums) ;
         vector<int> arr(n);
         arr[0] = nums[0];
        for (int i=1; i<n; i++){
            arr[i] = nums[i] + arr[i-1];
        }
        return arr;
    }
    
};