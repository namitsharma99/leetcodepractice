class Problem35SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        
        int left = 0, right = nums.length - 1;
        int middle = 0;

        while (left <= right) {

            middle = left + (right-left)/2 ;
            if (nums[middle] == target)
                return middle;

            if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

        }
        return left;

    }

}
