class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        int frequency = 1;
        for(int i = 1;i<nums.length;i++){
             if(frequency > nums.length/2){
                return num;
            }
            if(num != nums[i]){  
                num = nums[i];
                frequency = 1;
            }else{
                frequency++;
            }
           
        }
        return num;
    }
}