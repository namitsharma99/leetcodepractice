class Problem746MinCostClimbingStairs {

    // TLE - basic DP
    /* public int minCostClimbingStairs(int[] cost) {
        
        // DP problem
        // Steps allowed --> recursion calls

        int len = cost.length;

        return Math.min( findCost(cost, len-1), findCost(cost, len-2) );
    }

    private int findCost (int[] arr, int len) {
        if (len < 0)
            return 0;
        if (len < 2)
            return arr[len];

        return arr[len] + Math.min( findCost(arr,len-1) , findCost(arr,len-2));
    }

    */

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // TLE - Adding memoization to recursion -> O(n)
    
    /*   int[] dp;

    public int minCostClimbingStairs(int[] cost) {
            
        // DP problem
        // Steps allowed --> recursion calls

        int len = cost.length;
        dp = new int[len];
        return Math.min( findCost(cost, len-1), findCost(cost, len-2) );
    }

    private int findCost (int[] arr, int len) {
        if (len < 0)
            return 0;
        if (len < 2)
            return arr[len];

        if (dp[len] != 0)
            return dp[len];

        dp[len] = arr[len] + Math.min( findCost(arr,len-1) , findCost(arr,len-2));

        return dp[len];
    }

*/

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Accepted - Adding memoization to iteration instead of recursion -> O(n)
    /*
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        dp = new int[len];
        
        for (int i = 0; i< len; i++) {
            if (i < 2) {
                dp[i] = cost[i];
            } else {
                dp[i] = cost[i] + 
                        Math.min(dp[i-1],dp[i-2]);
            }
        }

        return Math.min(dp[len-1], dp[len-2]);
    }
    */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Adding memoization to iteration instead of recursion -> O(n)
    // Space O(n) to O(1)
    // Removal DP arr

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;

        if (len == 0)
            return 0;

        if (len == 1)
            return 1;

        int first  = cost[0];
        int second = cost[1];

        if (len <= 2) {
            return Math.min(first, second);
        }

        for (int i = 2; i< len; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }

        return Math.min(first, second);
    }

}
