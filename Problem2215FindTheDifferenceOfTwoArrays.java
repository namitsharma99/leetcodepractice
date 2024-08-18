class Problem2215FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] num1, int[] num2) {
        
        Map<Integer, Integer> map = new HashMap();

        List<Integer> nums1Unq = new ArrayList();
        List<Integer> nums2Unq = new ArrayList();

        Set<Integer> nums1 = getSet(num1);
        Set<Integer> nums2 = getSet(num2);

        for (int n1: nums1) {
            if (map.get(n1) == null) {
                map.put(n1, 1);
            }
        }

        for (int n2: nums2) {
            if (map.get(n2) == null) {
                nums2Unq.add(n2);
            } else {
                map.remove(n2);
            }
        }

        for (int n : map.keySet()) {
            nums1Unq.add(n);
        }


        List<List<Integer>> ls = new ArrayList();
        ls.add(nums1Unq);
        ls.add(nums2Unq);

        return ls;

    }

    private Set<Integer> getSet(int[] num) {
        Set<Integer> set = new HashSet();

        for (int n: num) {
            set.add(n);
        }

        return set;
    }
}
