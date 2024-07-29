class Problem345ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        
        char[] cArr = s.toCharArray();

        List<Integer> cList = new ArrayList();

        for (int idx = 0; idx < cArr.length; idx++) {
            char c = cArr[idx];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    cList.add(idx);
            }
        }

        // for (int i = 0; i< cList.size(); i++) {
        //     System.out.println(cList.get(i) + " ");
        // }

        for (int i = 0; i< cList.size()/2; i++) {
           // int aIdx = cList.get(i);
           // int bIdx = cList.get(cList.size()-i-1);
           // System.out.println("aIdx == " + aIdx + " & bIdx = " + bIdx);
            char temp = cArr[cList.get(i)];
            cArr[cList.get(i)] =  cArr[cList.get(cList.size()-i-1)];
            cArr[cList.get(cList.size()-i-1)] = temp;
        }


        String str = String.valueOf(cArr);
        return str;

    }
}
