     import java.util.Arrays;

public class KRadius {

    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        if (k == 0) {
            return nums;
        }

        int windowSize = 2 * k + 1;

        if (windowSize > n) {
            return ans;
        }

        long sum = 0;

        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        ans[k] = (int) (sum / windowSize);

        for (int i = windowSize; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - windowSize];

            ans[i - k] = (int) (sum / windowSize);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;

        KRadius obj = new KRadius();

        int[] result = obj.getAverages(nums, k);

        System.out.println(Arrays.toString(result));
    }
}