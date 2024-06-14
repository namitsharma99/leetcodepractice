class Problem122BestTimeToBuyAndSellStocksII {
    public int maxProfit(int[] prices) {

        // Kadane's Algorithm

        int diff = 0;
        int curr_price = prices[0];

        int profit = 0;
        int latestSellDay = 0;

        for (int i = 1; i< prices.length; i++) {


            System.out.println("i = " + i + ", diff = " + diff + ", curr_price = " + curr_price + ", profit = " + profit + ", latestSellDay = " + latestSellDay);

            if (prices[i] <  curr_price) {
                curr_price = prices[i];
                System.out.println("curr_price = " + curr_price);
            }
            else if (prices[i] - curr_price > diff && latestSellDay < i) {
                diff = prices[i] - curr_price;
                System.out.println("diff = " + diff);
                latestSellDay = i;
                System.out.println("latestSellDay = " + latestSellDay);
                profit += diff;
                System.out.println("profit = " + profit);
                curr_price = prices[i];
                System.out.println("curr_price = " + curr_price);
                diff = 0;
            }

            System.out.println("i = " + i + ", diff = " + diff + ", curr_price = " + curr_price + ", profit = " + profit + ", latestSellDay = " + latestSellDay);

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");

        }

        return profit;


    }
}
