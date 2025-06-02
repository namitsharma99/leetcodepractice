class Problem347TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i< nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(map);

        int[][] arr = new int[map.size()][2];

        int idx = 0;
        for (int key : map.keySet()) {
            arr[idx][0] = key;
            arr[idx][1] = map.get(key);
            idx++;
        }

        Arrays.sort(arr, (a,b) -> Integer.compare(b[1], a[1]));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = arr[i][0];
        }

        return result;

    }
}
