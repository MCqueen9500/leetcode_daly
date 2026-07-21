class Solution {
    public int minFlips(int a, int b, int c) {
        int steps = 0;
        
        while(c>0 || a>0 || b > 0){
            int lsb = c&1;
            int lsb_a = a&1;
            int lsb_b = b&1;
            if(lsb == 1 && ( lsb_a != 1 && lsb_b != 1)){
               
                steps++;

            }
            else if(lsb == 0){
                if(lsb_a == 1){
                    steps++;
                }
                if(lsb_b == 1){
                    steps++;
                }
               
            }
             c = c>>1;
                a = a>>1;
                b = b>>1;

        }
        return steps;
        
    }
}