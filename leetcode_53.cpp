class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum=nums[0], maxsum=nums[0];
        for (int i=1; i< size(nums) ; i++){
            sum = max(nums[i],sum+nums[i]);
            maxsum = max(maxsum, sum);
        }
         return maxsum;
    };
};