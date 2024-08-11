class Problem392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        

        if (s == null || t == null)
            return false;

            
        int t_idx = 0;
        int s_idx = 0;
        

        char[] tArr = t.toCharArray();
        char[] sArr = s.toCharArray();

        while (t_idx < tArr.length && s_idx < sArr.length) {

            if (sArr[s_idx] == tArr[t_idx]) {
                s_idx++;
                t_idx++;
            } else {
                t_idx++;
            }

        }

        if (s_idx == s.length()) 
            return true;
        else 
            return false;


    }
}
