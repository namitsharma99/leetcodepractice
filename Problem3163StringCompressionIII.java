class Problem3163StringCompressionIII {

    public String compressedString(String word) {

        int l = word.length();
        char[] chars = word.toCharArray(); 

        int left = 0, right = 0, count = 0, index = 0;
        String result = "";

        while (left < l) {

            right = left + 1;
            while (right < l && chars[left] == chars[right]) {
                right++;
            }
            count = right - left;

            if (count <= 9) {
                result += String.valueOf(count) + chars[left];
            } else {
                int rem = count % 9;
                int quot = count / 9;
                for (int i = 0; i< quot; i++) {
                    result += "9" + chars[left];
                }
                if ( rem != 0 )
                    result += String.valueOf(rem) + chars[left];
            }

            left = right;
            count = 0;

        }

        return result;
        
    }
}
