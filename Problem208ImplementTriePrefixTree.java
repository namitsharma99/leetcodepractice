class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        root.c = ' ';
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i< word.length();i++) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null)
                node.children[c - 'a'] = new TrieNode(c);
            
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i< word.length();i++) {
            char c = word.charAt(i);
            if (node.children[c - 'a'] == null)
                return false;

            node = node.children[c - 'a'];
        }        
        return node.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (node.children[c - 'a'] == null)
                return false;
            node = node.children[c - 'a'];
        }    
        return true;
    }
}

class TrieNode {
    char c;
    boolean isWord;
    TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
    public TrieNode(char val) {
        TrieNode node = new TrieNode();
        node.c = val;
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
