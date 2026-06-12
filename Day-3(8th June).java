//Program -1
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0 ){
                nums[k] = nums[i];
                k++;
            }

            
        }
        while( k < nums.length ){
            nums[k] = 0 ;
            k++;
        }

    }
}
//Program-2
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

       
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

       
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k; 
    }
}
//Program-3
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int [nums.length];
        int k = 0 ;

         for(int i = 0 ; i< nums.length ; i++){
            for(int j = 0 ; j<nums.length ; j++){
               if(nums[i] > nums[j] ){
                  k = k+1 ;

               }
                
            }
            ans[i]  = k ; 
            k = 0 ;

            
         } return ans ;
    }
}
//Program -4
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
//Program-5
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] ans = new int [nums.length];

        int k = 0 ;
        for(int i = 0 ; i <nums.length ; i++){
            if(nums[i] < pivot){
                ans[k] = nums[i];
                k++;
               
            }
        }
        for(int i = 0 ; i <nums.length  ; i++){
            if(nums[i] == pivot){
             ans[k] = pivot ;
             k++;
            }

        }
      
        for(int i = 0 ; i<nums.length ;i++){
            if(pivot < nums[i]){
                ans[k] = nums[i];
                k++;
               
            }
        }
        return ans;

    }
}