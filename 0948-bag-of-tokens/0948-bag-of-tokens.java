class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int max = 0;

        if(tokens.length == 0){
            return 0;
        }
        if(tokens[0]>power){
            return 0;
        }
        
        int j = 0;
        for(int i = 0;i<tokens.length - j;i++){
            if(power < tokens[i] && score > 0){
                power += tokens[tokens.length - 1 - j];
                score--;
                j++;
                i--;
                continue;
            }
            power -= tokens[i];
            score++;
            if(score > max){
                max = score;
            }
        }
        return max;
    }
}