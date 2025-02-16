class Problem901OnlineStockSpan {

    List<Integer> ls = null;
    int index = -1;

    public StockSpanner() {
        this.ls = new ArrayList<Integer>();
    }
    
    public int next(int price) {
        ls.add(price);
        index++;
        int ptr = index-1;
        int sum = 0;
        for (int i = ptr; i >= 0; i--) {
            if (ls.get(i) <= price) {
                sum++;
            } else {
                break;
            }
        }
        return sum+1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
