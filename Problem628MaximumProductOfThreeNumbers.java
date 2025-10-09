class Problem628MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        int prod1 = nums[n-1] * nums[0] * nums[1];
        int prod2 = nums[n-1] * nums[n-2] * nums[n-3];
        return Math.max(prod1, prod2);
        
        
    }
}
