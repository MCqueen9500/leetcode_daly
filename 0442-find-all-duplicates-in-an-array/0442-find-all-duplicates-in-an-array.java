class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int ans[] = new int[nums.length];
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != -1 && nums[nums[i] - 1] == -1){
                ans[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            else if(nums[i] != -1){
                int temp = nums[nums[i] - 1];
                if(nums[nums[i] - 1] == nums[i] && i == nums[i] - 1){
                    nums[i] = -1;
                    continue;
                }
                if(temp == 0){
                     nums[nums[i] - 1] = -1;
                nums[i] = 0;
                continue;
                }
                nums[nums[i] - 1] = -1;
                nums[i] = temp;
                i--;
            }
        }
        List<Integer> list = new ArrayList<>();

for (int i = 0; i < j; i++) {
    list.add(ans[i]);
}

return list;
    }
}