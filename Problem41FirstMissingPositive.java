class Problem41FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet();

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] > 0) {
                set.add(nums[i]);
            }
        }

        for (int i=1; i< Integer.MAX_VALUE; i++) {
            if (!set.contains(i))
                return i;
        }

        return 0;

        
    }
}
