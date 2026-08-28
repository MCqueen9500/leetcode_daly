class Solution {
    public int digSum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + ((n%10)*(n%10));
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = digSum(n);
        int fast = digSum(digSum(n));
        while(n!=1 && digSum(n)!=1){
            
            if(slow == fast){
                return false;
            }
            slow = digSum(n);
            fast = digSum(digSum(fast));
            n = digSum(n);
        }
        return true;
    }
}