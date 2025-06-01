class Problem950RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        
        Arrays.sort(deck);
        int len = deck.length;

        int[] result = new int[len];

        boolean isSkip = false;

        int deck_idx = 0;
        int result_idx = 0;

        while (deck_idx < len) {

            if (result[result_idx] == 0) {
                if (!isSkip) {
                    result[result_idx] = deck[deck_idx];
                    deck_idx++;
                }
                isSkip = !isSkip;
            }

            result_idx = (result_idx+1) % len; // key iterator for rotation

        }

        return result;

    }
}
