class Problem46Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList();
        permutation(nums, 0, result);
        return result;
        
    }

    private void permutation (int[] arr, int fi, List<List<Integer>> result) {

        if (fi == arr.length-1) {
            List<Integer> ls = new ArrayList();
            for (int i = 0; i< arr.length; i++) {
                ls.add(arr[i]);
            }
            result.add(ls);
            return;
        }

        for (int i = fi; i< arr.length; i++) {
            swap(arr, i, fi);
            permutation(arr, fi+1, result);
            swap(arr, i, fi);
        }


    }

    private void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
