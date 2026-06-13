class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> arr=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] prev=intervals[0];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(intervals[i][1],prev[1]);
            }else{
                arr.add(prev);
                prev=intervals[i];
            }

        }
        arr.add(prev);
        return arr.toArray(new int[arr.size()][]);
    }
}