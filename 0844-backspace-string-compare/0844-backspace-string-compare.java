class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str = new StringBuilder("");
        int j = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(j>=1){
                    j--;
                    str.deleteCharAt(j);
                }
            }
            else{
                str.append(ch);
                j++;
            }
        }
         String a = str.toString();
         str.setLength(0);
        j = 0;

        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(j>=1){
                    j--;
                    str.deleteCharAt(j);
                }
            }
            else{
                str.append(ch);
                j++;
            }
        }
        String b = str.toString();

        if(a.equals(b)){
            return true;
        }
        return false;
        
    }
}