class Problem136SingleNumber {

    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap();

        for (int n : nums) {
            Integer temp =  map.get(n);
            if (temp != null)
                map.put(n , temp + 1);
            else 
                map.put(n , 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }

        return 0;

    }
}
