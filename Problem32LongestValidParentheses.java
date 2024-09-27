class Problem32LongestValidParentheses {
    
    public int longestValidParentheses(String s) {
        
        if (s == null && s.length() <= 1)
            return 0;

        Stack<Integer> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
            // for opening bracket
                stack.push(i);
            } else {
            // for closing bracket
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(' ) {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        int max = 0;
        int last = s.length();

        while (!stack.isEmpty()) {
            int start = stack.pop();
            max = Math.max(max, last - start - 1);
            last = start;
        }

        return Math.max(last, max);
    }
}
