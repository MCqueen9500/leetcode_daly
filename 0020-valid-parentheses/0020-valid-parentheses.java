class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if((len & 1) == 1){
    return false;
}
        int array[] = new int[len];
        int top = -1;
        for(int i = 0;i<len;i++){
            char ch = s.charAt(i);
            if( ch == '('){
                top++;
                array[top] = ch;
            }
            else if(ch == ')'){
                if(top == -1 || array[top] != '('){
                    return false;
                }
                top--;
            }
            else if(ch == '{'){
                top++;
                array[top] = ch;
            }
            else if(ch == '}'){
                if(top == -1 || array[top] != '{'){
                    return false;
                }
                top--;
            }
            else if(ch == '['){
                top++;
                array[top] = ch;
            }
            else if(ch == ']'){
                if(top == -1 || array[top] != '['){
                    return false;
                }
                top--;
            }
        }
        if(top == -1){
            return true;
        }
        return false;
    }
}