class Solution {
    public int calPoints(String[] operations) {
        int i = 0;
        int array[] = new int[operations.length];
        for(int j = 0;j< operations.length;j++){
            String ch = operations[j];
            if(ch.equals("+")){
                if(i<2){
                    continue;
                }
                array[i] = array[i - 1] + array[i - 2];
                i++;
            }
            else if(ch.equals("D")){
                if(i<1){
                    continue;
                }
                array[i] = 2 * array[i-1];
                i++;
            }
            else if(ch.equals("C")){
                if(i < 1){
                    continue;
                }
                i -= 1;
            }
            else {
                array[i] = Integer.parseInt(ch);
                i++;
            }
        }
        int sum = 0;
        for(int j = 0;j<i;j++){
            sum += array[j];
        }

        return sum;
        
    }
}