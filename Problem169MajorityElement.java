class Problem169MajorityElement {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (int num: nums) {
            if(countMap.get(num) == null) {
                countMap.put(num, 1);
            } else {
                countMap.put(num, countMap.get(num) + 1);
            }
            if (countMap.get(num) > nums.length/2) {
                return num;
            }
        }

        return 0;
    }
    
}
