#include<iostream>
#include<stack>
#include<vector>
using namespace std;
int main(){
    vector<int> v;
    v.push_back(5);
    v.push_back(9);
    v.pop_back();
    v.push_back(12);
    v.push_back(19);
    v.pop_back();
    v.push_back(16);
    v.pop_back();
    cout<<"Top element : "<<v.back()<<endl;
    // stack<int> s;
    
    // s.push(5);
    // s.push(9);
    // s.pop();
    // s.push(12);
    // s.push(19);
    // s.pop();
    // s.push(16);
    // s.pop();
    // cout<<"Top element : "<<s.top()<<endl;
}