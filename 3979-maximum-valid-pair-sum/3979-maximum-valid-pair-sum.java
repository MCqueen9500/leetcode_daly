class Solution {
    int max(int nums[],int i){
        int max = Integer.MIN_VALUE;
        for(int k = i;k<nums.length;k++){
            if(nums[k]>max){
                max = nums[k];
            }
        }
        return max;
    }
    public int maxValidPairSum(int[] nums, int k) {
        int MaxSum = Integer.MIN_VALUE;
        int Max = max(nums,k);
        for(int i = 0;i<nums.length - k;i++){
           int sum = Max + nums[i];
           if(MaxSum < sum){
            MaxSum = sum;
           }
           if(nums[i+k]==Max){
            Max = max(nums,i+1+k);
           }
        }
        return MaxSum;
    }
}