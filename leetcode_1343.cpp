class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int threshold) {
       int  windowSum=0, avg=0, count=0;
        for( int i=0;i<k; i++){
            windowSum += arr[i];
        }
         if (windowSum/k >= threshold)
            count++;
        for( int i=k; i<size(arr); i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];
             if (windowSum/k  >= threshold)
            count++;
        }
        return count;
    }
};