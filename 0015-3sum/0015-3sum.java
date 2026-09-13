class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = 1;
        List<List<Integer>> ans = new ArrayList<>();

        int p3 = nums.length - 1;
        
        while(p1!=nums.length - 2){
            if(p1 != 0){
                if(nums[p1] == nums[p1 - 1]){
                    p1++;
                    p2 = p1 + 1;
                    p3 = nums.length - 1;
                    continue;
                }
            }
            while(p2 < p3){
                int sum = nums[p1] + nums[p2] + nums[p3];
                if(sum == 0){
                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[p1]);
                    sub.add(nums[p2]);
                    sub.add(nums[p3]);
                    ans.add(sub);
                    while(p2+1<nums.length && nums[p2] == nums[p2+1] ){
                        p2++;
                    }
                    p2++;
                }
                else if(sum < 0){
                    p2++;
                }
                else{
                    p3--;
                }
            }
            p1++;
            p2 = p1 + 1;
            p3 = nums.length - 1;
        }
        return ans;
    }
}