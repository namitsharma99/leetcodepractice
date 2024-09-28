class Problem214ShortestPalindrome {

    public String shortestPalindrome(String s) {
        
        String reverse = new StringBuilder(s).reverse().toString();

        if (s == null || s.length() <= 1 || s.equals(reverse)) {
            return s;
        }

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (
                s.substring(0, len - i).equals(reverse.substring(i))
                ) {
                    return reverse.substring(0,i) + s;
                }
        }

        return s;

        // TLE for all 'a' -->
    /* 
        if (s == null || s.length() <= 1 || isPalindrome(s)) {
            return s;
        }
       
        boolean found = false;
        String temp = s;

        int tail = s.length() - 1;
        while (temp.length() >= 1) {
            if (isPalindrome(temp))
                break;
            else {
                temp = temp.substring(0, tail--);
            }
        }

        tail++;
        //System.out.println("Junction found at tail = " + tail);

        if (tail == s.length()) {
            return s;
        } else {
            String prefix = "";
            while (tail < s.length()) {
                prefix = String.valueOf(s.charAt(tail++)) + prefix;
            }
            //System.out.println("prefix = " + prefix);
            return prefix+s;
        }
        */
    }

    private static boolean isPalindrome(String s) {
        int len = s.length();
        // a b c b a    5/2
        // a b c c b a  6/2
        int mid = len%2==0 ? len/2 -1 : len/2 ;
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len-1-i))
                return false;
        }
        return true;
    }
}
