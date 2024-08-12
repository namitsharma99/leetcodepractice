class Problem1456MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        
        if (s == null || s.length() == 0 || k > s.length() )
            return 0;

        char[] arr = s.toCharArray();

        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isCharVowel(arr[i])) {
                    count++;
                }
        }

        int max = count;
        

        for (int i = k; i < s.length(); i++) {

            if (isCharVowel(arr[i])) {
                count++;
            }
            if (isCharVowel(arr[i-k])) {
                count--;
            }
            max = count > max ? count : max;

        }

        return max;

    }

    private boolean isCharVowel(char c) {
            if (c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u') {
                    return true;
            } else 
                    return false;
    }
}
