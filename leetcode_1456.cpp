class Solution {
public:
    int maxVowels(string s, int k) {
        int count =0, maxcount=0;
        for (int i=0;i<k; i++){
            if ( s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
                count++;
            }
        }    
        maxcount = count;
        for (int j=k; j<size(s); j++){
             if ( s[j]=='a'||s[j]=='e'||s[j]=='i'||s[j]=='o'||s[j]=='u'){
                count++;
            }
             if ( s[j-k]=='a'||s[j-k]=='e'||s[j-k]=='i'||s[j-k]=='o'||s[j-k]=='u'){
                count--;
            }
        maxcount = max(maxcount, count);    
        }
    return maxcount;
    }
};