class Problem15_3Sum {
    
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet();

        for (int i = 0; i< nums.length; i++) {

            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> ls = new ArrayList();
                    ls.add(nums[i]);
                    ls.add(nums[left]);
                    ls.add(nums[right]);
                    result.add(ls);
                    left++; right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList(result);
        
    }
}
