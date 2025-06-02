class Problem220ContainsDuplicateIII {
  
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        
        // for (int i = 0; i < nums.length; i++) {
        //     int j = i+1;
        //     while (Math.abs(i-j) <= indexDiff && j< nums.length) {
        //         if (Math.abs(nums[i] - nums[j]) <= valueDiff)
        //             return true;
        //         j++;
        //     }
        // }

        // return false;
        // TLE, so trying other approach 
        
        
        
        
        int n = nums.length;

        TreeSet<Integer> set = new TreeSet();

        for (int i = 0; i< n; i++) {
            Integer num = nums[i];
            Integer floor = set.floor(num);
            Integer ceiling = set.ceiling(num);

            if (floor != null && Math.abs(floor - num) <= valueDiff)
                return true;

            if (ceiling != null && Math.abs(ceiling - num) <= valueDiff)
                return true;

            set.add(num);

            if (set.size() > indexDiff)
                set.remove(nums[i-indexDiff]);
        }

        return false;



    }
}
