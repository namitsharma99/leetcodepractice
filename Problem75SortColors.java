class Problem75SortColors {

    public void sortColors(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap();

        for (int n : nums) {
            Integer temp = map.get(n);
            if (temp == null) {
                map.put(n,1);
            } else {
                map.put(n, (temp + 1) );
            }
        }

        int i = 0;

        // int[] result = new int[nums.length];

        int n0 = map.get(0) == null ? 0 :  map.get(0);
        int n1 = map.get(1) == null ? 0 :  map.get(1);
        int n2 = map.get(2) == null ? 0 :  map.get(2);

        for (i = 0; i<n0; i++) 
            nums[i] = 0;
        for (; i< n0 + n1; i++)
            nums[i] = 1;
        for (; i< n0 + n1 + n2; i++)
            nums[i] = 2;
        
    }
}
