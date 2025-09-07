class Problem1752CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {

        int pivot = 0;

        for (int i=1; i< nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                pivot = i;
                break;
            }
        }

        int[] temp = new int[nums.length];
        int idx = 0;

        for (int i=pivot; i< nums.length; i++) {
            temp[idx++] = nums[i];
        }

        for (int i=0; i< pivot; i++) {
            temp[idx++] = nums[i];
        }

        // Arrays.stream(temp).forEach(
        //     s -> {System.out.print (s + " ");}
        // );

        for (int i = 1; i< temp.length; i++) {
            if (temp[i] < temp[i-1])
                return false;
        }

        return true;
        
    }
}
