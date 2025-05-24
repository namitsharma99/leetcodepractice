class Problem215KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        
        Queue<Integer> heap = new PriorityQueue(Collections.reverseOrder());

        for (int n : nums) {
            heap.add(n);
        }

        // for (int n : heap) {
        //     System.out.print(n + " ");
        // }

        for (int i = 0; i < k-1; i++) {
            heap.remove();
        }

        // System.out.println(" ");

        // for (int n : heap) {
        //     System.out.print(n + " ");
        // }

        return heap.peek();

    }
}
