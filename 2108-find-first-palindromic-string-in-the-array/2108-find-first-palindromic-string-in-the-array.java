class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i = 0;i<words.length;i++){
            boolean palandrom = true;
            for(int j = 0;j<words[i].length()/2;j++){
                if(words[i].charAt(j) != words[i].charAt(words[i].length() - j - 1)){
                    palandrom = false;
                    break;
                }
            }
            if(palandrom == true){
                return words[i];
            }
        }
        return "";
    }
}