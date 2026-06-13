class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int n=nums.length-1;
        while(i<=n){
            int mid=(i+n)/2;
            if(nums[mid]<target){
                i=mid+1;

            }else if(nums[mid]>target){
                n=mid-1;
            }else if(nums[mid]==target){
                return mid;
            }
        }
        return i;
        
    }
}