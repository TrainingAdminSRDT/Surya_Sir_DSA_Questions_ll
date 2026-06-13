class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0,j=n-1,k=n-1;i<=j;--k){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if(a>b){
                arr[k]=a;
                ++i;
            }else{
                arr[k]=b;
                --j;

            }
        }
        return arr;
    }
}