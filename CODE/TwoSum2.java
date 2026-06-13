import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {

            int sum = numbers[low] + numbers[high];

            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } 
            else if (sum < target) {
                low++;
            } 
            else {
                high--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        Solution obj = new Solution();
        int[] ans = obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(ans));
    }
}