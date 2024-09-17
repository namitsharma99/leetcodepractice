class Problem135Candy {
    public int candy(int[] ratings) {
        
        int n = ratings.length;

        int minCandies = n;

        int[] candies = new int[n];

        for (int k = 0; k< n; k++)
            candies[k] = 1;


        int i = 0;
        // fwd pass -  higher index if having higher rating will get more candies
        while (i < n-1) {
            if (ratings[i] < ratings[i+1])
                candies[i+1] = candies[i] + 1;

            i++;
        }

        // bkwd pass - lower index if having higher rating will get more candies
        i = n-2;
        while (i >=0 ) {
            if (ratings[i] > ratings[i+1])
                candies[i] =  Math.max(candies[i], candies[i + 1] + 1);

            i--;
        }

        int sum = 0;
        for (int candy : candies) {
            sum += candy;
        }

        return sum;
    }
}
