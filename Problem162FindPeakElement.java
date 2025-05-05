class Problem162FindPeakElement {
    public int findPeakElement(int[] nums) {
        
        int len = nums.length;

        if (len <= 1)
            return len -1;
        

        int left = 0, right = len-1;
        int idx = -1;

        while (right > left) {
            int mid = left + (right-left)/2;
            if (nums[mid] < nums[mid+1] ) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
