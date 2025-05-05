class Problem875KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        
        int len = piles.length;
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low < high) {

            int mid = low + (high-low)/2;
            
            int total = 0;
            for (int pile: piles) {
                total += pile/mid;
                if (pile%mid !=0) {
                    total++;
                }
            }

            if (total > h) {
                low = mid+1;
            } else {
                high = mid;
            }
            

        }

        return low;
    }
}
