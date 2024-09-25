class Problem3043FindTheLengthOfTheLongestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        

        Set<String> set = new HashSet<String>();

        int maxChar = 0;

        for (int n : arr1) {

            String temp = String.valueOf(n);

            for (int i = 1; i <= temp.length(); i++) {
                set.add(temp.substring(0, i));
            }
        }

        for (int n : arr2) {

            String temp = String.valueOf(n);

            for (int i = 1; i <= temp.length(); i++) {
                if (set.contains(temp.substring(0, i))) {
                    if (i > maxChar)
                        maxChar = i;
                }
            }

        }

        return maxChar;
    }
}
