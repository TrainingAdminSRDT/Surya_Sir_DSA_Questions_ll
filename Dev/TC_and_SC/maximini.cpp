#include<bits/stdc++.h>
using namespace std;
int main(){
    int nums[] = {5,9,75,13,2,58};
    int n = sizeof(nums)/sizeof(nums[0]);
    // sort(nums,nums+n);
    // cout<<"Mini"<<nums[0]<<endl;
    // cout<<"Maxi"<<nums[n-1]<<endl;

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]>nums[j]){
                swap(nums[i],nums[j]);
            }
        }
    }
    cout<<"Mini "<<nums[0]<<endl;
    cout<<"Maxi "<<nums[n-1]<<endl;
}