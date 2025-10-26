class Problem349IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0, j = 0; i< nums1.length && j < nums2.length; ) {

            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }


        int[] result = new int[set.size()];
        int idx = 0;
        for (int s : set) {
            result[idx++] = s;
        }

        return result;

    }
}
