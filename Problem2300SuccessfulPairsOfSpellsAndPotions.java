class Problem2300SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);

        int sLen = spells.length;
        int pLen = potions.length;

        int[] result = new int[sLen];

        for (int i = 0; i< sLen; i++) {

            int spell = spells[i];

            int low = 0;
            int high = pLen - 1;

            while (low <= high) {

                int mid = low + (high-low)/2;

                long prod = (long) spell * potions[mid];

                if (prod < success) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            result[i] = pLen - low; // getting count of only higher values

        }

        return result;

    }
}
