class Problem17LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList();

        if (digits == null || digits.isEmpty()) 
            return result;

        Map<Character, String> map = new HashMap();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve (0, digits, map, "", result);

        return result;
        
    }

    private void solve (int idx, String digits, Map<Character, String> map,
            String charsCovered, List<String> result) {

        if (idx == digits.length()) {
            result.add(charsCovered);
            return;
        }

        String letters = map.get(digits.charAt(idx));

        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            solve(idx+1, digits, map, charsCovered + c, result);
        }
    }

}
