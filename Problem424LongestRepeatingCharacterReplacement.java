class Problem424LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {


        int[] freqArr = new int[26];
        int left = 0, maxFreq = 0, maxWindow = 0;

        int n = s.length();
        char[] cArr = s.toCharArray();

        for (int right = 0; right < n; right++) {

            freqArr[ cArr[right] - 'A' ]++;

            maxFreq = Math.max( maxFreq , freqArr[ cArr[right] - 'A' ] );

            int window = right - left + 1; // because of 0 based indexing

            // to move left pointer
            if (window - maxFreq > k) {
                 freqArr[ cArr[left] - 'A' ]--;
                 left++;
            }

            window = right - left + 1;
            maxWindow = Math.max (window, maxWindow);


        }
        
        return maxWindow;

    }
}
