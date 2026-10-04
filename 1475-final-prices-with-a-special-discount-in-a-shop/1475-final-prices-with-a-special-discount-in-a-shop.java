class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[] = new int[prices.length];
        Stack <Integer> s = new Stack<>();
        boolean flag = false;
        for(int i = prices.length - 1;i>=0;i--){
            if(i == prices.length - 1){
                ans[prices.length - 1 - i] = prices[i];
                continue;
            }
            if(prices[i] >= prices[i+1]){
                ans[prices.length - 1 - i] = prices[i] - prices[i+1];
                s.push(prices[i+1]);
                continue;
            }
            if(!s.isEmpty()){
                while(!s.isEmpty()){
                     int val = s.peek();
                     if(val <= prices[i]){
                        ans[prices.length - 1 - i] = prices[i] - val;
                        flag = true;
                        break;
                     }
                     s.pop(); 
                }
                if(flag){
                    flag = false;
                    continue;
                } 
            }
                ans[prices.length - 1 - i] = prices[i];
        }

        for(int i = 0;i<ans.length/2;i++){
            int temp = ans[i];
            ans[i] = ans[ans.length - 1 - i];
            ans[ans.length - 1 - i] = temp;
        }
        return ans;
    }
}