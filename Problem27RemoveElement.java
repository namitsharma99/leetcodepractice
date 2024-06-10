class Solution {
    public int removeElement(int[] nums, int val) {
        
        int occr = 0;
        for (int i = 0; i <nums.length; i++) {
            if(val == nums[i]) {
                System.out.println("1. nums[i] "+ nums[i]);
                occr++;
                nums[i] = 999999;
            }
           // System.out.println("----------------------------------------");
        }
        Arrays.sort(nums);
        return nums.length - occr;
    }
}
