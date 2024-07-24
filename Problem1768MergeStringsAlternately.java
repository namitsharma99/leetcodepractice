class Problem1768MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        
        String finalStr = "";
        int i = 0, j = 0;

        for (;i < word1.length() && j < word2.length(); i++,j++) {
            finalStr = finalStr + word1.charAt(i) + word2.charAt(j);
        }

        if (i <= word1.length())
            finalStr = finalStr + word1.substring(i, word1.length());
        
        if (j <= word2.length())
            finalStr = finalStr + word2.substring(j, word2.length());

        return finalStr;
    }
}
