class Problem724FindPivotIndex {
    public int pivotIndex(int[] nums) {


        if (nums.length == 0) 
            return -1;
        
        if (nums.length == 1)
            return 0;

        int leftSum = 0, rightSum = 0, total = sum(nums);

        for (int i = 0; i< nums.length; i++) {
            rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum)
                return i;
            
            leftSum += nums[i];
        }

        return -1;
    }

    private int sum (int[] nums) {
        int sum = 0;
        for (int n :  nums) 
            sum += n;

        return sum;
    }

    
}
