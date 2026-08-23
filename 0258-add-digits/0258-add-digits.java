class Solution {
    public int addDigits(int num) {
        int len = Integer.toString(num).length();
        int sum = 0;
        while(len > 1){
            while(num!=0){
                sum += num%10;
                num = num/10;
            }
            num = sum;
            sum = 0;
            len = Integer.toString(num).length();
        }
        return num;
    }
}