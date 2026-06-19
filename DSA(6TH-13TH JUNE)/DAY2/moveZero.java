package DAY2;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int inserPos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
             int temp = nums[i];
             nums[i] = nums[inserPos];
             nums[inserPos] = temp;
             inserPos++;


            }
            
        }
        
    }

    
}
