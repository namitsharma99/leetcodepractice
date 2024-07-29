class Product238ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
        int prod = 1;
        int prod0 = 1;

        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                countZero++;
                if (countZero >= 2)
                    break;
            }
        }

        if (countZero >= 2)
            return new int[nums.length] ;


        for (int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            if(nums[i] != 0)
                prod0 = prod0 * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] == 0 ?  prod0 : prod/nums[i];
        }

        return arr;
        
    }
}
