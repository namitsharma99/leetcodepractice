class Problem443StringCompression {


    /* unable to submit this solution due to misinformation for AC
    public int compress(char[] chars) {
        
        Map<Character, Integer> map = new TreeMap();

        for (char c: chars) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        // System.out.println(map);
        String result = "";
        //char[] temp = new char[chars.length];
        //int i = 0;

        for (char c : map.keySet()) {
            String count = map.get(c) == 1 ? "" : String.valueOf(map.get(c));
            result += String.valueOf(c) + count;
            // System.out.println(result);
        }

        chars = result.toCharArray();

        return result.length();

    }
    */

        public int compress(char[] chars) {
        int i = 0, res = 0;
        while (i < chars.length) {
            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
                groupLength++;
            }
            chars[res++] = chars[i];
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i += groupLength;
        }
        return res;
    }

}
