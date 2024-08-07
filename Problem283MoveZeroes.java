class Problem283MoveZeroes {

    public void moveZeroes(int[] nums) {
        
        int len = nums.length;

        if (len < 2)
            return;

        for (int i = len-1; i > 0; i--) {

            if (nums[i-1] == 0) {
                for (int j = i-1; j < len - 1; j++) {
                    nums[j] = nums[j+1];
                }
               nums[len-1] = 0;
            }
            // System.out.print(i+" : ");
            // printArr(nums);
            // System.out.print("\n");

        }  

  /*     for (int i = 0; i < len-1; i++) {
            System.out.println("i: " + i);
            if (nums[i] == 0) {
                int j = i+1;
                while (j < len) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    j++;
                }
            }

           // printArr (nums);
        }
*/

    }

    // private void printArr(int[] nums) {
    //     for (int n: nums)
    //      System.out.print(n + ",");

    //     System.out.println("");
    // }

}
