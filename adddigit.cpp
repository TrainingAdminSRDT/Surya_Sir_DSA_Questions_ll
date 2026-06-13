#include<iostream>
using namespace std;
//Problem 258.
class Solution {
public:
    int addDigits(int num) {
        while(sizeof(num)>1){
        int n = 0;
        for(int i = 0; i<sizeof(num); i++){
         n = num%10;
         n += num/10;
        }
        return n;
        }
        // return n;

    }
};