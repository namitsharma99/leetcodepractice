class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n != 0 ) {
            for (int t = 0; t< nums1.length; t++) {
                nums1[t] = nums2[t];
            }
        } else if (m != 0 && n == 0) {
            
        } else {
            int[] temp = new int[m+n];
            int idx = 0;

            int i = 0, j = 0;
            for (i=0, j=0; i < m && j < n; ) {
                if(nums1[i] < nums2[j]) {
                    temp[idx] = nums1[i];
                    System.out.println("1:: " + nums1[i]);
                    System.out.println("i = " + i + " , j = " + j + " , idx = " + idx + " val: " + temp[idx]);
                    i++;
                } else {
                    temp[idx] = nums2[j];
                    System.out.println("2:: " + nums2[j]);
                    System.out.println("i = " + i + " , j = " + j + " , idx = " + idx + " val: " + temp[idx]);
                    j++;
                }
                idx++;
            }

            for (int a = i ; a < m ; a++) {
                temp[idx++] = nums1[a];
            }
            System.out.println("==================================");
            for (int b = j ; b < n ; b++) {
                temp[idx] = nums2[b];
                //System.out.println("i = " + i + " , j = " + j + " , idx = " + idx + " val: " + temp[idx]);
                idx++;

            }

            for (int t = 0; t< nums1.length; t++) {
                nums1[t] = temp[t];
            }
        }
    }
}
