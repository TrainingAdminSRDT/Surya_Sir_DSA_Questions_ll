#include <iostream>
#include <vector>

class Solution {
public:
    int searchInsert(std::vector<int>& nums, int target) {
        int n = nums.size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
};

int main() {
    std::vector<int> nums = {1, 3, 5, 6};
    int target = 5;
    Solution sol;
    int index = sol.searchInsert(nums, target);
    std::cout << index << std::endl;
    return 0;
}
