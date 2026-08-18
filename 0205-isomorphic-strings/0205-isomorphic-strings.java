class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        boolean s_ = true;
        char arr[] = new char[255];
        for(int i = 0;i<s.length();i++){
            if(arr[s.charAt(i)]=='\u0000'){
                arr[s.charAt(i)] = t.charAt(i);
            }
            else if(arr[s.charAt(i)] != t.charAt(i)){
                s_ = false;
            }
        }
        char arr2[] = new char[255];
        boolean t_ = true;
        for(int i = 0;i<s.length();i++){
            if(arr2[t.charAt(i)]=='\u0000'){
                arr2[t.charAt(i)] = s.charAt(i);
            }
            else if(arr2[t.charAt(i)] != s.charAt(i)){
                t_ = false;
            }
        }
        return s_ & t_;
    }
}