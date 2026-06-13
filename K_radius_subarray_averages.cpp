//Ques: 2090 K Radius Subarray Averages

// class Solution {
// public:
//     vector<int> getAverages(vector<int>& nums, int k) {
//         int n = nums.size();
//         vector<int> ans(n,-1);

//         long long s=0;
//         for (int i=0; i<n; i++) {
//             s = s + nums[i];
//         }
//         if(i >= k+2) {
//             ans[i-k] = s/ 2*k+1;

//             s = s- nums[i-2k];
//         }

//     }
// };




class Solution {
public:
    vector<int> getAverages(vector<int>& nums, int k) {

        int n = nums.size();
        vector<int> ans(n, -1);

        long long s = 0;

        for (int i = 0; i < n; i++) {

            s = s + nums[i];

            if (i >= 2 * k + 1) {
                s = s - nums[i - (2 * k + 1)];
            }

            if (i >= 2 * k) {
                ans[i - k] = s / (2 * k + 1);
            }
        }

        return ans;
    }
};