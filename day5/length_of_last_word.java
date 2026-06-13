class Solution {
    public int lengthOfLastWord(String s) {
        // int cnt=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=' '){
        //         cnt++;
        //     }else{
        //         cnt=0;
        //     }
        // }
        // return cnt;
        int n=s.length()-1;
        //if(s.length()==1) return 1;
        while(n>=0 && s.charAt(n)==' '){
            n--;
        }
        int count=0;
        while(n>=0 && s.charAt(n)!=' '){
            count++;
            n--;
        }
        return count;
    }
}