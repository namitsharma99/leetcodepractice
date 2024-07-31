class Problem167TwoSumiiInputArrayIsSorted {
 public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];        
        // for (int i = 0; i < numbers.length; i++) {
        //     int j = i+1;
        //     while (j < numbers.length && (numbers[i] + numbers[j] <= target)) {
        //         if (numbers[i] + numbers[j] == target) {
        //             result[0] = i+1;
        //             result[1] = j+1;
        //             return result;
        //         }
        //         j++;
        //     }
        // }
        int i = 0;
        int j = numbers.length - 1;
        while (i<j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i+1;
                result[1] = j+1;
                return result;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }

        }

         return result;

    }
}
