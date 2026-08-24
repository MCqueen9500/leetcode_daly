class Solution {
   
    public int maxValidPairSum(int[] nums, int k) {
        int MaxSum = Integer.MIN_VALUE;
        int Max = nums[0];
        int i = 0;
        for(int j = k;j<nums.length ;j++){
           if(Max < nums[i]){
            Max = nums[i];
           }
           int sum = Max + nums[j];
           if(MaxSum < sum){
            MaxSum = sum;
           }
           i++;
        }
        return MaxSum;
    }
}