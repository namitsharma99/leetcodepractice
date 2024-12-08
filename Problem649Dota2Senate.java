class Problem649Dota2Senate {
    
    public String predictPartyVictory(String senate) {
        
        char[] senateChars = senate.toCharArray();

        Queue<Integer> rQueue = new LinkedList();
        Queue<Integer> dQueue = new LinkedList();

        int idx = 0;

        for (char c: senateChars) {
            if (c == 'R') {
                rQueue.add(idx++);
            } else {
                dQueue.add(idx++);
            }
        }

        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rIdx = rQueue.remove();
            int dIdx = dQueue.remove();
            if (rIdx < dIdx) {
                rQueue.add(rIdx + senate.length());
            } else {
                dQueue.add(dIdx + senate.length());
            }
        }


        if (rQueue.isEmpty()) {
            return "Dire";
        } else {
            return "Radiant";
        }

    }
}
