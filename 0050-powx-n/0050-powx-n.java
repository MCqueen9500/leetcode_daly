class Solution {

    public double Power(double x, int n) {
        int pow = n;
       if(pow == 0){
        return 1;
       }
       if(pow == 1 || pow == -1){
        return x;
       }
       double ans = Power(x,pow/2);
       
       if(pow%2 == 0){
        x =   ans * ans;
       }
       else{
        x =  ans * ans * x;
       }
       return x;
    }
    public double myPow(double x, int n) {
       x = Power(x,n);
       if(n < 0){
        x = 1/x;
       }
       return x;
    }
}