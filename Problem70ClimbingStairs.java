class Problem70ClimbingStairs {
    public int climbStairs(int n) {
        return dp(n);
    }

    private int dp (int n) {

        // if (n<0) {
        //     return 0;
        // }
        // if (n<=2) {
        //     return n;
        // }

        // return dp(n-1) + dp(n-2);

        if (n<0) {
            return 0;
        }
        if (n<=1) {
            return n;
        }

        int[] memory = new int[n+1];
        memory[1] = 1;
        memory[2] = 2;

        for (int i=3; i<=n; i++) {
            memory[i] = memory[i-1] + memory[i-2];
        }

        return memory[n];

    }
}
