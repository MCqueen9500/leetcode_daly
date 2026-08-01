class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (ans.length() > 0 && k > 0 && ch < ans.charAt(ans.length() - 1)) {
                ans.deleteCharAt(ans.length() - 1);
                k--;
            }
            ans.append(ch);
        }

        // if k still remains, the stack is non-decreasing, so trim from the end
        while (k > 0 && ans.length() > 0) {
            ans.deleteCharAt(ans.length() - 1);
            k--;
        }

        // strip leading zeros
        int start = 0;
        while (start < ans.length() - 1 && ans.charAt(start) == '0') {
            start++;
        }

        String result = ans.substring(start);
        return result.isEmpty() ? "0" : result;
    }
}