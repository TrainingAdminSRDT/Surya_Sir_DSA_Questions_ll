import java.util.Arrays;

public class Solution {

    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;

        while (low <= high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        Solution obj = new Solution();
        obj.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}