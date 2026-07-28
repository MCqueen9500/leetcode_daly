class StockSpanner {
    int index ;
    int array[];

    public StockSpanner() {
        index = 0;
        array =  new int[10000];

    }
    
    public int next(int price) {
        array[index] = price;
        int ct = 0;
        int i = index;
        while(i>0 && (array[index] >= array[i])){
            ct++;
            i--;
        }
        if(i == 0 && (array[index] >= array[0])){
            ct++;
        }
        index++;
        return ct;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */