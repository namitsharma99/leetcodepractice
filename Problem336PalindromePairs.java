class Problem336PalindromePairs {

    public List<List<Integer>> palindromePairs(String[] words) {
        
        List<List<Integer>> result = new ArrayList();

        if (words == null || words.length < 1)
            return result;

        Map<String, Integer> map = new HashMap<>();

        int i = 0;
        for (String word : words) {
            map.put(word, i++);
        }

        i = 0;
        for (String word : words) {
            // scenario 1
            if (word.equals("")) {
                for (int j = 0; j < words.length; j++) {
                    String w = words[j];
                    if (i != j && isPalindrome(w)) {
                        result.add(List.of(i, j));
                        result.add(List.of(j, i));
                    }
                }
            }

            // scenario 2
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            String wordRev = sb.toString();
            if (map.containsKey(wordRev)) {
                int idx = map.get(wordRev);
                if (i != idx)
                    result.add(List.of(i, idx));
            }

            // scenario 3
            for (int j = 1; j < wordRev.length(); j++) {
                String subRight = wordRev.substring(j);
                if (map.containsKey(subRight) && isPalindrome(word+subRight)) {
                    result.add(List.of(i, map.get(subRight)));
                }
                String subLeft = wordRev.substring(0,j);
                if (map.containsKey(subLeft) && isPalindrome(subLeft+word)) {
                    result.add(List.of(map.get(subLeft), i));
                }
            }


            i++;
        }
        
        return result;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() -i - 1))
                return false;
        }
        return true;
    }
}
