class Problem1732FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        
        int max = 0;

        int height = 0;

        for (int n : gain) {

            height += n;

            if (max < height)
                max = height;
        
        }

        return max;

    }
}
