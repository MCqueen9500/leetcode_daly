class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int front = nums.length - 2;
        int back = nums.length - 1;
        boolean rev_sorted = true;
        while(front >=0){
            back = nums.length - 1;
            if(nums[front]<nums[back] ){
                rev_sorted = false;
                int temp = nums[front];
                int i;
                for(i = front + 1;i<nums.length;i++){
                    if(nums[i] > temp){
                        break;
                    }
                }
                nums[front] = nums[i];
                nums[i] = temp;
                return;
            }
            else{
                int i = front;
                int j = front + 1;
                while(j<nums.length){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                }
            }
            front--;
        }
       
    }
}