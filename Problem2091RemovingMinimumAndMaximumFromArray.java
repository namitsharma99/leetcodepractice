class Problem2091RemovingMinimumAndMaximumFromArray {
  
    public int minimumDeletions(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = -1, maxIdx = -1;

        if (nums.length < 2)
            return nums.length;

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }

        // int maxDistance = Math.min(maxIdx, nums.length-maxIdx+1);
        // int minDistance = Math.min(minIdx, nums.length-minIdx+1);

        // return maxDistance+minDistance;

        // calculating the farthest distance from both ends
        int frontDistanceMin = Math.max(minIdx,maxIdx) + 1;
        int rearDistanceMin = nums.length - Math.min(minIdx,maxIdx);

        // calculating total distance min from both ends
        int bothDistanceMin = (Math.min(minIdx,maxIdx) + 1) + (nums.length - Math.max(minIdx,maxIdx));
        
        return Math.min(frontDistanceMin,Math.min(rearDistanceMin,bothDistanceMin));
        
    }
}
