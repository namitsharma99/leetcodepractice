class Problem3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        
        if (s == null)
            return 0;

        int len = s.length();

        if (s.length() <= 1)
            return len;

        int maxLength = 1;

        int start = 0, end = 1;

        Set<Character> set = new HashSet();
        set.add(s.charAt(start));

        while (end < len) {
            char c = s.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                maxLength = set.size() > maxLength ? set.size() : maxLength;
                end++;
            } else {
                set = new HashSet();
                start++;
                set.add(s.charAt(start));
                end = start + 1;
            }
        }

        return maxLength;
    }
}
