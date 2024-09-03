class Problem31NextPermutation {
    public void nextPermutation(int[] nums) {
        
        if (nums.length <= 1) {
            return;
        }
        
        int brk = -1;

        for (int i = nums.length-1; i > 0; i--) {

            //System.out.println("i: " + i);

            if (nums[i] > nums[i-1]) {
                //System.out.println("Breakpoint found!");
                brk = i-1;
                break;
            }

        }

        //System.out.println("Break point == " + brk);

        if (brk == -1) {
            //System.out.println("Reversing");
            nums = rev(nums);
        } else {
            for (int i = nums.length - 1; i > brk; i--) {
                if (nums[i] > nums[brk]) {
                    //System.out.println("Swapping");
                    int temp = nums[i];
                    nums[i] = nums[brk];
                    nums[brk] = temp;
                    //Arrays.stream(nums).forEach(n -> {System.out.print(n + " ");});
                    //System.out.println("");
                    break;
                }
            }

            int[] temp = Arrays.copyOfRange(nums, brk+1, nums.length);
            Arrays.sort(temp);
            //System.out.println("temp :: ");
            //Arrays.stream(temp).forEach(n -> {System.out.print(n + " ");});


            int idx = brk+1;
            for (int i = 0; i < temp.length ; i ++) {
                nums[idx++] = temp[i];
            }

            //System.out.println("nums :: ");
            //Arrays.stream(nums).forEach(n -> {System.out.print(n + " ");});

        }





    }

    private int[] rev(int[] arr) {

        int front = 0;
        int rear = arr.length-1;

        while (rear > front) {
            int temp = arr[front];
            arr[front] = arr[rear];
            arr[rear] = temp;
            front++;
            rear--;
        }

        return arr;
    }
}
