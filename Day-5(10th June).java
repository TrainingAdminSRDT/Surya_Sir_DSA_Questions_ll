//Program-1
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0 ;
        int j = numbers.length-1 ;
        while(i <= j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int []{i+1 , j+1};
            }
            else if(sum < target){
                i ++;

            }
            else{
                j--;
            }
        }return new int []{};
    }
}
//Program-2
class Solution {
    public int search(int[] nums, int target) {
      int left = 0 ;
      int right = nums.length -1;
      for(int i = 0 ; i <nums.length ; i++){
        int mid = (left + right )/2;
            if(nums[mid] == target){
                return mid ;

            }
            else if( nums[mid] < target){
                left = mid+1;

            }
            else {
                right = mid -1 ;
            }
      }return -1 ;  
    }
}
//Program-3
class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return left;
    }
}
//Program -4class Solution {
    public void reverseString(char[] s) {

   int i = 0 ;
   int j = s.length -1 ;
   while(i <j){
    char temp = s[i];
    s[i] = s[j];
    s[j] = temp ;
    i++;
    j--;
   }
    }
}
//Program -5
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
//Program -6
class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
//Program -7
class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i))
                    != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
//Program -8
import java.util.*;

class Solution {
    int[][] stMax, stMin;
    int[] lg;
    int[] nums;

    private int getValue(int l, int r) {
        int len = r - l + 1;
        int p = lg[len];

        int mx = Math.max(stMax[p][l], stMax[p][r - (1 << p) + 1]);
        int mn = Math.min(stMin[p][l], stMin[p][r - (1 << p) + 1]);

        return mx - mn;
    }

    public long maxTotalValue(int[] nums, int k) {
        this.nums = nums;
        int n = nums.length;

        lg = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            lg[i] = lg[i / 2] + 1;
        }

        int m = lg[n] + 1;

        stMax = new int[m][n];
        stMin = new int[m][n];

        for (int i = 0; i < n; i++) {
            stMax[0][i] = nums[i];
            stMin[0][i] = nums[i];
        }

        for (int j = 1; j < m; j++) {
            int len = 1 << j;
            int half = len >> 1;

            for (int i = 0; i + len <= n; i++) {
                stMax[j][i] = Math.max(
                    stMax[j - 1][i],
                    stMax[j - 1][i + half]
                );

                stMin[j][i] = Math.min(
                    stMin[j - 1][i],
                    stMin[j - 1][i + half]
                );
            }
        }

        class Node {
            int l, r;
            long val;

            Node(int l, int r, long val) {
                this.l = l;
                this.r = r;
                this.val = val;
            }
        }

        PriorityQueue<Node> pq =
            new PriorityQueue<>((a, b) -> Long.compare(b.val, a.val));

        for (int l = 0; l < n; l++) {
            pq.offer(new Node(l, n - 1, getValue(l, n - 1)));
        }

        long ans = 0;

        while (k-- > 0) {
            Node cur = pq.poll();

            ans += cur.val;

            if (cur.r > cur.l) {
                int nr = cur.r - 1;
                pq.offer(new Node(
                    cur.l,
                    nr,
                    getValue(cur.l, nr)
                ));
            }
        }

        return ans;
    }
}