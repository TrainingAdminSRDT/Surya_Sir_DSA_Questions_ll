
//Program -1  
Array Based Question

class Main {
    public static void main(String[] args) {
        int [] nums = { 5 , 9 ,75 , 13 , 2,58} ;
        int max = 0 ;
        int min = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            else if(nums[i] < min){
                min = nums[i];
            }
        
            
        }
        
        System.out.println(max);
        System.out.println(min);
    }
}

// Program -2

leetcode 169
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}

//program - 3
Leetcode 26
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

//Program 3
public class Solution {

    public int reverseBits(int n) {

        int result = 0;



        for (int i = 0; i < 32; i++) {

            result <<= 1;        

            result |= (n & 1);    

            n >>>= 1;           

        }



        return result;

    }

}