class Solution {
    public int removeDuplicates(int[] nums) {
        
        int[] filteredArr = new int[nums.length];

        int reference = -200;
        int idx = 0;
        for (int num: nums) {
            // System.out.println("num: " + num + " & reference: " + reference);
            if (num != reference) {
                filteredArr[idx] = num;
                reference = num;
                idx++;
            }
        }
        for (int i = 0; i< nums.length; i++) {
            nums[i] = filteredArr[i];
        }
        return idx;
    }
}
