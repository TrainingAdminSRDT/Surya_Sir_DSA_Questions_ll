public class min_max{
    public static void main(String[] args) {
        int nums[]={5,9,75,13,2,58};
        int min=Integer.MAX_VALUE;
        int m,n;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];

            }
        System.out.println(min);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];


            }
        System.out.println(max);
        }
    }
}