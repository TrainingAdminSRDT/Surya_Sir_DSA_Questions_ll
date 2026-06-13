// ques:977 . Squares of a Sorted Array


class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);
        for(int i=0, j = n-1 , k = n-1; i <= j; --k) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];

            if (a>b) {
                ans[k] = a;
                ++i;

            } else {
                ans[k] =b;
                --j;
            }
        }
        return ans;
    }
};



// class Solution {
// public:
//     vector<int> sortedSquares(vector<int>& nums) {

//         for(int i = 0; i < nums.size(); i++) {
//             nums[i] = nums[i] * nums[i];
//         }

//         sort(nums.begin(), nums.end());

//         return nums;
//     }
// };