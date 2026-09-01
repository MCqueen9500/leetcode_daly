class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n == 1){
            return true;
        }
        int count = 0;
        int count1 = 0;
        while(n!=0){
            int one = n&1;
            if(one == 1){
                count1++;
            }
            count++;
            n = n>>1;
            
        }
        count = count - 1;
        return (count%2 == 0 && count1 == 1);
    }
}