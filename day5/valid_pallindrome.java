class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i)){
                s.charAt(i)=s.charAt(i).toLowerCase();
            }else if(Character.isAlphanumeric(s.charAt(i))){
                i++;
            }
        }
        int j=0;
        int k=s.length()-1;
        while(j<k){
            if(s.charAt(j)!=s.chart(k)) return false;
        }
    }
}