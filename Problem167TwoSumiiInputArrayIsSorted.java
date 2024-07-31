class Problem167TwoSumiiInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];        
        for (int i = 0; i < numbers.length; i++) {
            int j = i+1;
            while (j < numbers.length && (numbers[i] + numbers[j] <= target)) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
                j++;
            }
        }

         return result;

    }
}
