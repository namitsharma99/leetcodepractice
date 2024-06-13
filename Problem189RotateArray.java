class Problem189RotateArray {
    public void rotate(int[] nums, int k) {
        
        // long method

        // while (k > 0) {
        //     int last = nums[nums.length - 1];
        //     for (int i = nums.length-1; i > 0; i--) {
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = last;
        //     k--;
        // }



        // faster method

        if (nums.length > k) {

            int[] tail = new int[k];
            System.arraycopy(nums, nums.length-k, tail, 0, k);

            for (int i = nums.length - 1; i >= k; i--) {
                nums[i] = nums[i-k];
            }

            for (int j = 0, counter = 0; j < tail.length && counter <=k ; j++, counter++) {
                nums[counter] = tail[j];
            }

        } else {
            while (k > 0) {
                int last = nums[nums.length - 1];
                for (int i = nums.length-1; i > 0; i--) {
                    nums[i] = nums[i-1];
                }
                nums[0] = last;
                k--;
            }
        }




    }

}
