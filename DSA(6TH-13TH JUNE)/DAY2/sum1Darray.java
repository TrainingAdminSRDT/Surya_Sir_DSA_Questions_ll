package DAY2;

public class sum1Darray {
    public int[] runningSum(int[] nums) {
        int[] newSum = new int[nums.length];
        newSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            newSum[i] = nums[i] + newSum[i - 1];
        }
        return newSum;
    }

    // ADD THIS TO RUN IT:
    public static void main(String[] args) {
        sum1Darray solver = new sum1Darray();
        int[] input = {1, 2, 3, 4};
        int[] result = solver.runningSum(input);
        
        // Print the result to verify
        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}