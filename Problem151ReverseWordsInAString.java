class Problem151ReverseWordsInAString {
    public String reverseWords(String s) {
        
        s = s.replaceAll(" +", " ").trim();
        String[] arr = s.split(" ");

        String result = "";
        for (int i = arr.length-1; i>=0; i--) {
            // System.out.println(arr[i]);
            //if(!arr[i].contains(" "))
            result = result + " " + arr[i] ;
        }

        return result.trim();

    }
}
