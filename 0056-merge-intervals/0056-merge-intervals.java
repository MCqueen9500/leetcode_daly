class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1;i<intervals.length ;i++){
            if(intervals[i][0] <= end){
                int previousEnd = end;
                end = intervals[i][1];
                if(intervals[i][1] < intervals[i - 1][1]){
                    end = intervals[i - 1][1];
                }
                if(previousEnd > end){
                    end = previousEnd;
                }
            }
            else{
                int arr[] = new int[2];
                arr[0] = start;
                arr[1] = end;
                ans.add(arr);
                start = intervals[i][0];
                end = intervals[i][1]; 
            }
        }
        int arr[] = new int[2];
        arr[0] = start;
        arr[1] = end;
        ans.add(arr);
        return ans.toArray(new int[ans.size()][]);
    }
}