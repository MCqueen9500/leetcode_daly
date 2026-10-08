class Solution {

    public void recursion(List<List<Integer>> ans,List<Integer> el,int[] candidates, int target,int idx){
        if(target == 0){
            List<Integer> temp = new ArrayList<>(el);
            ans.add(temp);
            return;
        }
        if(target < 0 ){
            return;
        }
        for(int i = idx;i<candidates.length;i++){
            int val = candidates[i];
            el.add(val);
            recursion(ans,el,candidates,target - val,i);
            el.remove(el.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> el = new ArrayList<>();
        recursion(ans,el,candidates,target,0);
        return ans;
    }
}