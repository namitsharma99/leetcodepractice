class Problem1413MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        
        int sum = 0;
        int k = 1;
        for (int i : nums) {
            sum += i;
            if (k + sum < 1) {
                k = 1 - sum;
            }
        }
        return k;

    }
}
