class Problem494TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        
        return findMatchingSums(nums, 0, 0, target);

    }

    private int findMatchingSums(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
            if (sum == target) { 
                return 1;
            } else {
                return 0;
            }
        }
        return findMatchingSums(nums, index+1, sum + nums[index], target)
        + findMatchingSums(nums, index+1, sum - nums[index], target);
    }
}
