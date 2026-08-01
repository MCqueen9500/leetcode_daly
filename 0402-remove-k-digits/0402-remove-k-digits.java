class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder stack = new StringBuilder();

        for (char ch : num.toCharArray()) {

            while (stack.length() > 0 &&
                   k > 0 &&
                   stack.charAt(stack.length() - 1) > ch) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }

            stack.append(ch);
        }

        // If removals are still left, remove from the end
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        // Remove leading zeros
        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }

        String ans = stack.substring(i);

        return ans.isEmpty() ? "0" : ans;
    }
}