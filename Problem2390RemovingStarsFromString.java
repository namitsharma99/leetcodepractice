class Problem2390RemovingStarsFromString {
    public String removeStars(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }

        if (s.length() == 1 && s.charAt(0) == '*')
            return "";

        if (s.length() == 1 && s.charAt(0) != '*')
            return s;

        char[] sArr = s.toCharArray();

    /* 
    
    // Timing out for big inputs -- 

        List<Character> ls = new ArrayList();

        for (char c: sArr) {
            ls.add(c);
        }

        int idx = 0;
        while (idx < ls.size() - 1) {
            //System.out.println("idx------------: " + idx);
            if (idx < ls.size() - 1 && ls.get(idx+1) == '*') {
                //System.out.println("At idx     : " + ls.get(idx));
                //System.out.println("At idx + 1 : " + ls.get(idx+1));
                ls.remove(idx+1);
                ls.remove(idx);
                //System.out.println("REMOVED !");
                idx--;
            } else {
                idx++;
                //System.out.println("INCREMENTED: " + idx);
            }
        }

        String result = "";
        for (int i = 0; i<ls.size(); i++ ) {
            result = result + String.valueOf(ls.get(i));
        }

    */ 

    // Better approach using Stacks

    Stack<Character> stack = new Stack();

    for (char c: sArr) {
        if (c == '*')
            stack.pop();
        else
            stack.push(c);
    }

    String result = "";

    while (!stack.isEmpty()) {
        result = String.valueOf(stack.pop()) + result;
    }

    return result;

    }
}
