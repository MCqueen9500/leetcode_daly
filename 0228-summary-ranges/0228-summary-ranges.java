class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        int a = nums[0];
        int b = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == b+1){
                b = nums[i];
            }
            else{
                if(a == b){
                    ans.add(Integer.toString(a));
                }
                else{
                String s = Integer.toString(a) + "->" + Integer.toString(b);
                ans.add(s);
                }
                a = nums[i];
                b = nums[i];
            }
           
        }
         if(a == b){
                ans.add(Integer.toString(a));
            }
            else{
                String s = Integer.toString(a) + "->" + Integer.toString(b);
                ans.add(s);
            }
        return ans;
    }
}