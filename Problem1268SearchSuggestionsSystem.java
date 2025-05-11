class Problem1268SearchSuggestionsSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        TrieNode root = new TrieNode();

        for (String product: products)
            root.addWord(product, root);

        List<List<String>> result = new ArrayList<>();

        for (int i = 1; i<= searchWord.length(); i++) {
            result.add(root.searchWords(searchWord.substring(0,i), root));
        }

        return result;


    }


    class TrieNode {
        boolean isWord;
        TrieNode[] children;
        
        TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }

        public void addWord (String word, TrieNode root) {
            for (char c: word.toCharArray()) {
                if (root.children[c - 'a'] == null) {
                    root.children[c - 'a'] = new TrieNode();
                } 
                root = root.children[c - 'a'];
            }
            root.isWord = true;
        }

        public List<String> searchWords(String word, TrieNode root) {
            TrieNode node = root;
            List<String> words = new ArrayList<>();
            for(char c: word.toCharArray()) {
                if (node.children[c -'a'] == null) {
                    return words;
                }
                node = node.children[c - 'a'];
            }
            dfs(node, word, words);
            return words;
        }

        public void dfs(TrieNode root, String word, List<String> words) {
            if (words.size() == 3) {
                return;
            } 
            if (root.isWord == true) {
                words.add(word);
            }
            for (char c = 'a'; c <= 'z'; c++) {
                if (root.children[c - 'a'] != null) {
                    dfs(root.children[c - 'a'], word+c, words);
                }
            }
        }
    }

 

}
