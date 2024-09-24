class Problem1200MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> output = new ArrayList();
        Arrays.sort(arr);

        int minSum = Integer.MAX_VALUE;
        for (int i = 1; i< arr.length; i++) {
            // System.out.println("i : " + i + " , arr[i-1] : " + arr[i-1] + " , arr[i] : " + arr[i]);
            if (arr[i] - arr[i-1] < minSum) {
                minSum = arr[i] - arr[i-1];
            }
            // System.out.println(minSum);
        }
        // System.out.println(minSum);
        for (int i = 1; i< arr.length; i++) {
            if (arr[i] - arr[i-1] == minSum) {
                output.add ( Arrays.asList(arr[i-1], arr[i]) );
            }
        }

        return output;
    }
}
