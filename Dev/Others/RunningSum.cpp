#include<bits/stdc++.h>
using namespace std;
int main() {
    vector<int> nums = {1, 5, 4, 7, 8};
    int n = nums.size();

    for(int i = 1; i < n; i++) {
        nums[i] += nums[i - 1];
    }
    for(int x : nums) {
        cout << x << " ";
    }
    return 0;
}