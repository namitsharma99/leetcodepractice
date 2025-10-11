class Problem647PalindromicSubstrings {

    public int countSubstrings(String s) {

        int count = 0;
        
        for (int i = 0; i< s.length(); i++) {

            // odd
            count += checkAndCountPalindromes(i,i,s);

            // even
            count += checkAndCountPalindromes(i,i+1,s);
        }

        return count;
        
    }

    private int checkAndCountPalindromes(int low, int high, String s) {

        int count = 0;

        while (low >= 0 && high < s.length() 
            && (s.charAt(low) == s.charAt(high) )) {
                count++;
                low--; high++; // expanding the window
            }
        return count;
    }
}
