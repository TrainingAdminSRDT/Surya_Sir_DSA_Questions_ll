class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(mp.containsKey(arr[i])){
        //         mp.getValue(arr[i])++;
        //     }else{
        //         mp.put(arr[i],1);
        //     }
        // }
        int n=nums.length;

        // for(int i=1;i<=n-1;i++){
        //     if(nums[i]<nums[i-1]){
        //         int temp=nums[i];
        //         nums[i]=nums[i-1];
        //         nums[i-1]=temp;
        //     }
        // }
        Arrays.sort(nums);
        return nums[n/2];

    }
}