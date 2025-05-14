class Problem523ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> remainders = new HashMap();
        // rem , idx

        int sum = 0;

        remainders.put(0, -1);

        for (int i = 0; i< nums.length; i++) {
            //System.out.println("remainders map :: " + remainders);

            //System.out.println("i  :: " + i);
            sum += nums[i];
            //System.out.println("sum  :: " + sum);
            int remainder = sum % k;
            //System.out.println("remainder  :: " + remainder);

            if (remainders.containsKey(remainder)) {
                if (i - remainders.get(remainder) >=2 ) {
                    return true;
                }
            } else {
                remainders.put(remainder, i);
            }
        }

        return false;
    }

    /** 
    Dry Run: [23,2,4,6,7] ,  k = 6
    map -> { 0,-1 }
    i = 23 | rem = 5 | map -> { 0,-1 } , {}

    
    */
}
