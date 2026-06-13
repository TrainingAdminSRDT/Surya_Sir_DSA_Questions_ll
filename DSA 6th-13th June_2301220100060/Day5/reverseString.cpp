#include<iostream>
#include<vector>
using namespace std;
//Problem 344
class Solution {
public:
    void reverseString(vector<char>& s) {
        int st = 0, end = s.size()-1;

        while(st < end){
            swap(s[st++], s[end--]);
        }
        
    }
};