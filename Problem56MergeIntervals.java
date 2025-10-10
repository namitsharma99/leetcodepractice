class Problem56MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b)-> { return a[0] - b[0]; } );

        List<int[]> mergedList = new LinkedList();

        for (int[] interval: intervals) {

            if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
                mergedList.add(interval);
            } else {
                mergedList.getLast()[1] = Math.max(interval[1],  mergedList.getLast()[1]);
            }

        }

        return mergedList.toArray(new int[0][0]);
        
    }
}
