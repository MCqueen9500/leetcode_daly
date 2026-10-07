class Solution {
    public int[] subArray(int[] arr,int i){
        int arr2[] = new int[arr.length - i];
        for(int j = i;j<arr.length;j++){
            arr2[j-i] = arr[j];
        }
        return arr2;
    }
    public void recursion(List<List<Integer>> ans,List<Integer> el,int[] candidates, int target){
        if(target == 0){
            ans.add(new ArrayList<>(el));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = 0;i<candidates.length;i++){
            if(i>0 && candidates[i] == candidates[i - 1]){
                continue;
            }
            int val = candidates[i];
            el.add(val);
            int arr[] = subArray(candidates,i+1);
            recursion(ans,el,arr,target - val);
            el.remove(el.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> el = new ArrayList<>();
        Arrays.sort(candidates);
        recursion(ans,el,candidates,target);
        return ans;
    }
}