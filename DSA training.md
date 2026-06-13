### LEETCODE 14

class Solution {

&#x20;   public String longestCommonPrefix(String\[] strs) {

&#x20;       if(strs==null||strs.length==0){

&#x20;           return"";

&#x20;       }

String prefix=strs\[0];

for(int i=1;i<strs.length;i++)

{

&#x20;   while(strs\[i].indexOf(prefix)!=0){

&#x20;       prefix=prefix.substring(0,prefix.length()-1);

&#x20;       if(prefix.isEmpty()){

&#x20;           return"";

&#x20;       }

&#x20;   }

}

return prefix;

&#x20;   }

}



### LEETCODE 1768

class Solution {

&#x20;   public String mergeAlternately(String word1, String word2) {

&#x20;       StringBuilder result=new StringBuilder();

&#x20;       int i=0,j=0;

&#x20;       while(i < word1.length()||j < word2.length()){

&#x20;           if(i<word1.length()){

&#x20;               result.append(word1.charAt(i));

&#x20;               i++;

&#x20;           }

&#x20;           if(j<word2.length()){

&#x20;               result.append(word2.charAt(j));

&#x20;               j++;

&#x20;           }

&#x20;       }

&#x20;       return result.toString();

&#x20;       }

}



### LEETCODE 1

class Solution {

&#x20;   public int\[] twoSum(int\[] nums, int target) {

&#x20;       int\[] nums=new num\[4];

&#x20;       for(int i=0;i<nums.length();i++){

&#x20;        for(int j=i+1;j<nums.length;j++){

&#x20;           if(nums\[i]+nums\[j]==target){

&#x20;               return new int\[]{i,j};

&#x20;           }

&#x20;            else{

&#x20;               System.out.println("target not found");

&#x20;           }

&#x20;        }

&#x20;       }

&#x20;   }

}



### LEETCODE 169

class Solution {

&#x20;   public int majorityElement(int\[] nums) {

&#x20;       int candidate = 0;

&#x20;       int count = 0;



&#x20;       for (int num : nums) {

&#x20;           if (count == 0) {

&#x20;               candidate = num;

&#x20;           }



&#x20;           if (num == candidate) {

&#x20;               count++;

&#x20;           } else {

&#x20;               count--;

&#x20;           }

&#x20;       }



&#x20;       return candidate;

&#x20;   }

}



### LEETCODE 53

class Solution {

&#x20;   public static int maxSubArray(int\[] nums) {

&#x20;       int i;

&#x20;       int sum=nums\[0];

&#x20;       int maxsum=nums\[0];

&#x20;       for(i=1;i<nums.length;i++){

&#x20;           maxsum=Math.max(maxsum + nums\[i],nums\[i]);

&#x20;           sum=Math.max(maxsum,sum);

&#x20;       }

&#x20;       return sum;

&#x20;   }

&#x20;       public static void main(String\[] args){

&#x20;           int\[] nums= {10,-2,8,-11,-3,4,5};

&#x20;           System.out.println(maxSubArray (nums));

&#x20;       }

&#x20;

&#x20;

&#x20;   }



### LEETCODE 643

class Solution {

&#x20;   public double findMaxAverage(int\[] nums, int k) {

&#x20;       int sum=0;

&#x20;       for(int i=0;i<k;i++){

&#x20;           sum=sum+nums\[i];

&#x20;       }

&#x20;           int maxSum=sum;

&#x20;           for(int i=k;i<nums.length;i++){

&#x20;               sum+=nums\[i]-nums\[i-k];

&#x20;               maxSum=Math.max(maxSum,sum);

&#x20;           }

&#x20;       

&#x20;       return (double)maxSum/k;



&#x20;       

&#x20;   }

}



### LEETCODE 27

class Solution {

&#x20;   public int removeElement(int\[] nums, int val) {

&#x20;       int k=0;

&#x20;       for(int i=0;i<nums.length;i++){

&#x20;           if(nums\[i]!=val){

&#x20;               nums\[k]=nums\[i];

&#x20;               k++;

&#x20;           }

&#x20;       }

&#x20;       return k;



&#x20;       

&#x20;   }

}



### LEETCODE977

class Solution {

&#x20;   public int\[] sortedSquares(int\[] nums) {

&#x20;       int sqrt\[]=new int\[nums.length];

&#x20;       for(int i=0;i<nums.length;i++){

&#x20;           sqrt\[i]=nums\[i]\*nums\[i];

&#x20;           

&#x20;       }

&#x20;       Arrays.sort(sqrt);

&#x20;       return sqrt;

&#x20;       

&#x20;   }

// }



### LEETCODE 704

class Solution {

&#x20;   public int search(int\[] nums, int target) {

&#x20;       int mid,left,right;

&#x20;       left=0;

&#x20;       right= nums.length-1;

&#x20;       while(left<=right){

&#x20;           mid=left+(right-left)/2;

&#x20;           if(nums\[mid]==target)

&#x20;               return mid;

&#x20;           else if(nums\[mid]<target)

&#x20;               left=mid+1;

&#x20;               



&#x20;               else

&#x20;                   right=mid-1;

&#x20;               }

&#x20;           

&#x20;           return -1;



&#x20;       

&#x20;       

&#x20;       

&#x20;       

&#x20;   }

}



### LEETCODE35

class Solution {

&#x20;   public int searchInsert(int\[] nums, int target) {

&#x20;       int left = 0, right = nums.length - 1;



&#x20;       while (left <= right) {

&#x20;           int mid = left + (right - left) / 2;



&#x20;           if (nums\[mid] == target) {

&#x20;               return mid;           

&#x20;           } else if (nums\[mid] < target) {

&#x20;               left = mid + 1;       // search right half

&#x20;           } else {

&#x20;               right = mid - 1;      // search left half

&#x20;           }

&#x20;       }



&#x20;       return left;  

&#x20;   }

}



### LEETCODE 344

class Solution {

&#x20;   public void reverseString(char\[] s) {

&#x20;       int left=0,right=s.length-1;

&#x20;       while(left<right){

&#x20;           char temp=s\[left];

&#x20;           s\[left]=s\[right];

&#x20;           s\[right]=temp;

&#x20;           left++;

&#x20;           right--;

&#x20;       }

&#x20;       

&#x20;   }

}



### LEETCODE 160

public class Solution {

&#x20;   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

&#x20;       ListNode a= headA, b = headB;

&#x20;       while(a!=b){

&#x20;           a=(a==null)? headB:a.next;

&#x20;           b=(b==null)? headA:b.next;

&#x20;       }

&#x20;       return a;

&#x20;       

&#x20;   }

}



### LEETCODE 141

public class Solution {

&#x20;   public boolean hasCycle(ListNode head) {

&#x20;       ListNode slow=head;

&#x20;       ListNode fast=head;

&#x20;       while(fast!=null \&\& fast.next!=null){

&#x20;           slow=slow.next;

&#x20;           fast=fast.next.next;

&#x20;           if(slow==fast)

&#x20;           return true;

&#x20;       }

&#x20;       return false;

}

}



### LEETCODE21

class Solution {

&#x20;   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

&#x20;       ListNode dummy=new ListNode(0);

&#x20;       ListNode current=dummy;

&#x20;       while(list1!=null \&\& list2!=null){

&#x20;           if(list1.val<=list2.val){

&#x20;               current.next=list1;

&#x20;               list1=list1.next;



&#x20;           }else{

&#x20;               current.next=list2;

&#x20;               list2=list2.next;



&#x20;           }

&#x20;           current=current.next;

&#x20;       }current.next=(list1!=null)?list1:list2;

&#x20;       return dummy.next;

&#x20;   }

}





&#x20;       

&#x20;       

&#x20;   



