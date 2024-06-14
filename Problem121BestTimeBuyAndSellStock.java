class Problem121BestTimeBuyAndSellStock {
    public int maxProfit(int[] prices) {

        // int diff = 0;
        // for (int i = 0; i< prices.length-1; i++) {
        //     for (int j = i+1; j<prices.length; j++) {
        //         if (j-i>0 && (prices[j]-prices[i] > diff)) {
        //             diff = prices[j]-prices[i];
        //         }
        //     }
        // }

        // return diff;


        /********************************************************/

        // Kadane's Algorithm

        int diff = 0;
        int curr_price = prices[0];

        for (int i = 1; i< prices.length; i++) {

            if (prices[i] <  curr_price)
                curr_price = prices[i];
            else if (prices[i] - curr_price > diff) 
                diff = prices[i] - curr_price;

        }

        return diff;

    }




}
