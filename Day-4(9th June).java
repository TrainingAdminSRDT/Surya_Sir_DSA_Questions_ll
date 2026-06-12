//Program-1
class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (i >= 2 * k) {

                ans[i - k] = (int)(sum / (2 * k + 1));

                sum -= nums[i - 2 * k];
            }
        }

        return ans;
    }
}
//Program-2
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0 ;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] != val){
                nums[slow] = nums[i];
                slow++;
            }
        }return slow ;
    }
}
//Program-3
class Solution {
    public int[] sortedSquares(int[] nums) {

        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = nums[i] * nums[i];

            
        // }
        // Arrays.sort(nums);
        
        // return nums;


 int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0, j = n - 1, k = n - 1; i <= j; --k) {

            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];

            if (a > b) {
                ans[k] = a;
                ++i;
            } else {
                ans[k] = b;
                --j;
            }
        }

        return ans;
    }
}
//Program-4
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0 ;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i] != val){
                nums[slow] = nums[i];
                slow++;
            }
        }return slow ;
    }
}