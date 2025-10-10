class Problem49GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList();

        Map<String, List<String>> map = new HashMap();

        for (String str: strs) {

            String sortedKey = sortString(str);

            if (map.get(sortedKey) != null) {
                map.get(sortedKey).add(str);
            } else {
                List<String> ls = new ArrayList();
                ls.add(str);
                map.put(sortedKey, ls);
            }

        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
        
    }

    private String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}
