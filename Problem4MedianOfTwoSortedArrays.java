class Problem4MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        List<Integer> ls = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) 
                ls.add(nums1[i++]);
            else
                ls.add(nums2[j++]);

        }

        while (i < nums1.length) {
             ls.add(nums1[i++]);
        }

        
        while (j < nums2.length) {
             ls.add(nums2[j++]);
        }

        int len = ls.size();
        // List<Integer> ls = new ArrayList<>(ls);

        int mid = len/2;
        //System.out.println("mid :: " + mid);

        if (len%2 != 0) // odd
            return ls.get(mid);
        else { // even
            return (  (ls.get(mid - 1) + ls.get(mid) ) / 2.0 ) ;
        }
    }
}
