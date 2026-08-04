class Solution {
    public int firstMissingPositive(int[] nums) {
       for(int i = 0;i<nums.length;i++){
        if(1 <= nums[i] && nums[i] <=nums.length){
            if(nums[nums[i] - 1] == nums[i]){
                continue;
            }
            int temp = nums[nums[i] - 1];
            nums[nums[i] - 1] = nums[i];
            nums[i] = temp;
            i--;
        }
       }
       for(int i = 0;i<nums.length;i++){
        if(nums[i] != i+1){
            return i+1;
        }
       }
       return nums.length + 1;
    }
}