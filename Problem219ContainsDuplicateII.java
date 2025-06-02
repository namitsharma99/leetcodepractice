class Problem219ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // int low = 0; 
        // int high = 0;

        // while (low <= high && high < nums.length) {
        //     while (Math.abs(low - high) <= k && high < nums.length) {
        //         if ( nums[low] == nums[high] )
        //             return true;
        //         high++;
        //     }
        //     low++;
        // }

        // return false;

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i< nums.length; i++) {

            int n = nums[i];

            if (map.get(n) == null) {
                map.put(n, i);
            } else {
                if (Math.abs(map.get(n) - i) <= k )
                    return true;

                // updating the latest index
                map.put(n, i);
            }

        }

        return false;
    }
}
