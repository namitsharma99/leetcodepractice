class Problem78Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList();

        List<Integer> list = new ArrayList();

        int index = 0;
        rec(nums, index, list, result);

        return result;
        
    }

    private void rec (int[] nums, int index, List<Integer> list, List<List<Integer>> result) {

        if (index >= nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
    
        // including ith element
        list.add(nums[index]);
        rec(nums, index+1, list, result);
        // excluding ith element
        list.remove(list.size()-1);
        rec(nums, index+1, list, result);

    }
}
