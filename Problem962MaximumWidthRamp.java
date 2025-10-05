class Problem962MaximumWidthRamp {
    public int maxWidthRamp(int[] nums) {

        // Brute Force - n^2
        // int maxWidth = 0, gap = 0;
        // for (int i = 0; i< nums.length-1; i++) {
        //     for (int j = i+1; j< nums.length; j++) {
        //         if (nums[j] >= nums[i]) {
        //             gap = Math.max(gap, j-i);
        //         }
        //     }
        // }
        // return gap;
        
        
        // Better approach - O(n), S(n)
        int[] maxArr = new int[nums.length];
        maxArr[nums.length-1] = nums[nums.length-1];
        for (int j = nums.length-2; j >= 0; j--) {
            maxArr[j] = Math.max(maxArr[j+1], nums[j]);
        }
        // for (int m: maxArr) {
        //     System.out.print(m + " ");
        // }
        int j = 0, gap = 0;
        for (int i=0; i< nums.length; i++) {

            while (j < nums.length && nums[i] <= maxArr[j]) {
                gap = Math.max(gap, j-i);
                j++;
            }

        }
        return gap;

    }
}
