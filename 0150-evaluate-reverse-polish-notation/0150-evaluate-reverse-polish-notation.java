class Solution {
    public int evalRPN(String[] tokens) {
        int array[] = new int[tokens.length];
        int j = 0;
        for(int i = 0;i<tokens.length;i++){
            String ch = tokens[i].toString();
            if(ch.equals("+")){
                array[j-2] = array[j - 1] + array[j - 2];
                j -=1;
            }
            else if(ch.equals("-")){
                array[j-2] = array[j - 2] - array[j - 1];
                j -=1;
            }
            else if(ch.equals("*")){
                array[j-2] = array[j - 1] * array[j - 2];
                j -=1;
            }
            else if(ch.equals("/")){
                array[j-2] = array[j - 2] / array[j - 1];
                j -=1;
            }
            else{
                array[j] = Integer.parseInt(ch);;
                j++;
            }
        }
        return array[j - 1];
    }
}