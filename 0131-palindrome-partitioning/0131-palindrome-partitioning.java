class Solution {
    public boolean palindrome(String s){
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public void recursion(List<List<String>> ans,List<String> el,String s){
        if(s.length() == 0){
            List<String> temp = new ArrayList<>(el);
            ans.add(temp);
            return;
        }

        for(int i = 0;i<s.length();i++){
            String tm = s.substring(0,i+1);
            if(palindrome(tm)){
                el.add(tm);
                recursion(ans,el,s.substring(i+1));
                el.remove(el.size() - 1);
            }   
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> el = new ArrayList<>();
        recursion(ans,el,s);
        return ans;
    }
}