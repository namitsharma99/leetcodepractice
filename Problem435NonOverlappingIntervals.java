class Problem435NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        
        // for (int i=0; i<intervals.length; i++) {
        //     for (int j=0; j<intervals[0].length; j++) {
        //         System.out.print(intervals[i][j] + " ");
        //     }
        //     System.out.print(" , ");
        // }
        // System.out.println("");

        Arrays.sort( intervals, (a,b) -> { return a[1] - b[1]; } );

        // for (int i=0; i<intervals.length; i++) {
        //     for (int j=0; j<intervals[0].length; j++) {
        //         System.out.print(intervals[i][j] + " ");
        //     }
        //     System.out.print(" , ");
        // }
        // System.out.println("");

        int prev_end = intervals[0][1];
        int removalCount = 0;

        for (int i=1; i< intervals.length; i++) {
            if (prev_end > intervals[i][0]) {
                removalCount++;
            } else {
                prev_end = intervals[i][1];
            }
        }



        // int m = intervals.length;
        // int removalCount = 0;
        // Map<Integer, Integer> map = new HashMap();
        
        // for (int[] interval : intervals) {

        //     int start = interval[0];
        //     int end = interval[1]-1;
        //     boolean alreadyFilled = false;

        //     for (int i = start; i <= end; i++) {
        //         alreadyFilled = alreadyFilled || ( map.get(i) != null) ;
        //     }

        //     if (alreadyFilled) {
        //         removalCount++;
        //     } else {
        //          for (int i = start; i <= end; i++) {
        //             map.put(i, 1);
        //          }
        //     }

        // }

        return removalCount;

    }
}
