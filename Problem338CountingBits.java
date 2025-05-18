class Problem338CountingBits {

    public int[] countBits(int n) {
        
        int[] result = new int[n+1];

        for (int i = 0; i <=n ;i++) {
            result[i] = getSum(i);
        }

        return result;
    }

    private int getSum(int n) {
        int sum = 0;
        int q = n / 2;
        int r = n % 2;
        sum = r;
        while (q != 0) {
            r = q % 2;
            q = q / 2;
            sum += r;
        }
        return sum;
    }

}
