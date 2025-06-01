class Problem53MaximumSubarray {

    public int maxSubArray(int[] nums) {


        if (nums.length == 1 ) {
            return nums[0];
        }

        int max_sum = Integer.MIN_VALUE;

        int left = 0, right = 0, sum = 0;

        while (right < nums.length) {

            sum = sum + nums[right];

            if (sum > max_sum)
                max_sum = sum;

            right++;

            if (sum <= 0) {
                left = right;
                sum = 0;
            }

        }

        return max_sum;
        
    }
}
