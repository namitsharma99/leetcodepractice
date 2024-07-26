class Problem1431KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = findGreatest(candies);
        // int max = Integer.valueOf(max_min.split(":")[0]);
        // int min = Integer.valueOf(max_min.split(":")[1]);

        List<Boolean> result = new ArrayList();

        // System.out.println("Range # of candies can have - min to max " 
        //     + (min+extraCandies) + " & " + (max+extraCandies));

        for (int candyCount : candies) {
            if (candyCount+extraCandies  >= max)
                result.add(true);
            else 
                result.add(false);
        }
        return result;
    }

    private int findGreatest (int[] candies) {
        int max = 0;
        // int min = 9999;
        for (int n : candies) {
            if (n>max)
                max = n;
            // if (n<min)
            //     min = n;
        }
        // return max+":"+min;
        return max;
    }
}
