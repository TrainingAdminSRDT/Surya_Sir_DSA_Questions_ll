class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int windowSum = 0, maxSum=0;
      for(int i=0; i<k; i++){
        windowSum += nums[i];
      }
        maxSum = windowSum;
        for(int i=k;i<size(nums);i++){
            windowSum += nums[i];
            windowSum -= nums[i-k];
            maxSum = max(windowSum,maxSum);
        }
        
        return (double) maxSum/k;
    }
};