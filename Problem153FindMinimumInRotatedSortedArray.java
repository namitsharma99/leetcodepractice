class Problem153FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        
        int low = 0, high = nums.length - 1;
        int mid;

        while (low < high) {

            mid = low + (high-low)/2;

            // System.out.println(mid);
            // System.out.println("----------");

            // finding the start of original unrotated sorted array
            if (mid != 0 && nums[mid-1] > nums[mid]) {
                return nums[mid];
            }

            // else, continuing adjusting the pointers
            // eg. 4,5,6, 7 ,0,1,2
            if(nums[mid] >= nums[low] && nums[mid] > nums[high]) {
                low = mid+1;
            } else {
                high = mid-1;
            }


        }

        return nums[low];
    }
}


