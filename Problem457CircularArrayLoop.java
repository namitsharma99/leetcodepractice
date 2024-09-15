class Problem457CircularArrayLoop {
  
    public boolean circularArrayLoop(int[] nums) {
        
        Set<Integer> visited = new HashSet();

        for (int i = 0; i < nums.length; i++) {

            if (visited.contains(i) || nums[i] == 0)
                continue;

            int slow = i;
            int fast = i;

            boolean isCurrentDirPos = (nums[i] > 0);

            while (true) {

                slow = getNextPtr(slow, nums, isCurrentDirPos);
                if (slow == -1)
                    break;
                fast = getNextPtr(fast, nums, isCurrentDirPos);
                if (fast == -1)
                    break;
                fast = getNextPtr(fast, nums, isCurrentDirPos);
                if (fast == -1)
                    break;

                //System.out.println("slow : " + slow + ", fast : " + fast);

                if (slow == fast) 
                    return true;
                
                visited.add(slow);
                visited.add(fast);

            }
        }

        return false;
    }

    private int getNextPtr(int ptr, int[] nums, boolean isCurrentDirPos) {

        System.out.print("ptr : " + ptr + " , ");
        boolean isNewDirectionPos = nums[ptr] > 0;

        int len = nums.length;

        if (isCurrentDirPos != isNewDirectionPos)
            return -1;

        int nextPtr = ( ptr + nums[ptr] ) % len;

        if (nextPtr < 0 ) 
            nextPtr += len;
        
        if (nextPtr == ptr)
            return -1;

        return nextPtr;

    }

}
