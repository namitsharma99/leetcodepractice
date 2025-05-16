class Problem125ValidPalindrome {

    public boolean isPalindrome(String s) {

        // if (s == null || s.equals(""))
        //     return false;
        
        // int n = s.length();

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        // String s2 = "";

        // for (char c : s.toCharArray()) {
        //     if ((c >= 'a' && c <='z') || (c >= '0' && c <='9'))
        //         s2 += String.valueOf(c);
        // }

        // return isPalindromeCheck(s2);

        int left = 0, right = s.length()-1;

        while (left <= right) {
            if ( s.charAt(left) != s.charAt(right) ) 
                return false;
            left++;
            right--;
            
        }
        return true;
    }

 /*   boolean isPalindromeCheck(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i< n/2; i++) {
            if (arr[i] != arr[n-i-1]) 
                return false;
        }
        return true;
    }
    */
}
