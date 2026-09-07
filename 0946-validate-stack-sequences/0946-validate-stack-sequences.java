class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int stack[] = new int[pushed.length];
        int stackP = 0;
        int pushP = 0;
        int popP = 0;

        int num = popped[popP];
        while(pushP != pushed.length ){
            if(stackP != 0 && stack[stackP - 1] == num){
                popP += 1;
                if(popP == popped.length){
                    return true;
                }
                num = popped[popP];
                stackP -= 1;
            }
            else if(pushed[pushP] == num){
                popP += 1;
                pushP++;
                if(popP == popped.length){
                    return true;
                }
                num = popped[popP];
                

            } 
            else{
                stack[stackP] = pushed[pushP];
                pushP += 1;
                stackP++;
            }
        }

        while(stackP != 0){
            if(stack[stackP-1] != popped[popP]){
                return false;
            }
            stackP--;
            popP++;
        }
        return true;
    }
}