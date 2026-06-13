#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int j = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums[i] != 0) {
                swap(nums[i], nums[j]);
                j++;
            }
        }
    }
};

int main() {
    Solution obj;
    vector<int> nums = {0, 1, 0, 3, 12};
    obj.moveZeroes(nums);
    cout << "Output: ";
    for(int x : nums) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}