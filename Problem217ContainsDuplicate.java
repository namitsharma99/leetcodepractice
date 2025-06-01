class Problem217ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        int a = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (a == nums[i]) {
                return true;
            }
            a = nums[i];
        }

        return false;
    }

}
