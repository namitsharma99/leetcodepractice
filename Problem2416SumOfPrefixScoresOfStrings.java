class Problem2416SumOfPrefixScoresOfStrings {

    Node root = new Node();

    public int[] sumPrefixScores(String[] words) {
        
        // populate the trie
        for (String word : words) {
            add(word);
        }

        int[] result = new int[words.length];
        for (int i = 0; i< result.length; i++) {
            result[i] = calculate(words[i]);
        }

        return result;
    }

    private void add(String s) {
        Node temp = root;
        for (char c: s.toCharArray()) {
            if (temp.child[c - 'a'] == null) {
                temp.child[c - 'a'] = new Node();
            }
            temp.child[c - 'a'].score++;
            temp = temp.child[c - 'a'];
        }
    }

    private int calculate(String s) {
        int sum = 0;
        Node temp = root;
        for (char c : s.toCharArray()) {
            sum += temp.child[c - 'a'].score;
            temp = temp.child[c - 'a']; 
        }
        return sum;
    }

}

class Node {
    int score = 0;
    Node[] child = new Node[26];
}
