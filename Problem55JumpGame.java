class Problem55JumpGame {
    public boolean canJump(int[] nums) {
       int ptr = 0;
       for(int i = 0; i < nums.length; i++) {
            System.out.println("i: " + i + ", num: " + nums[i] + ", ptr: " + ptr);
            if(i > ptr) {
                System.out.println("Returning false!");
                return false;
            }
            int jump = i + nums[i];
            ptr = Math.max(ptr, jump);
            System.out.println("jump: " + jump + ", i: " + i + ", ptr: " + ptr);
            System.out.println("-------------------------------------------");
       } 
       return true;
    }
}
