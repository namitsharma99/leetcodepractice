class Problem1004MaxConsecutiveOnesIII {
    
    public int longestOnes(int[] nums, int k) {
        
        int len = nums.length;

        if (len == 0)
            return 0;

        if (len == 1)
            return nums[0]==0? 1 : 0;

        int max = Integer.MIN_VALUE;

        int i = 0, j = 0;
        for ( ; j < len; j++) {
            if (nums[j]==0) {
                k--;
            }
            if (k < 0 && nums[i++] == 0) {
                k++;
            }
        }
        return j-i;

    }
}
