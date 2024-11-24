class Problem20ValidParentheses {
  
    public boolean isValid(String s) {

        if (null == s || s.length() < 1)
            return false;

        char[] cArr = s.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for (char c :  cArr) {
            if (c == '(' ||
                c == '{' ||
                c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                if ((stack.peek() == '(' && c == ')') ||
                    (stack.peek() == '{' && c == '}') ||
                    (stack.peek() == '[' && c == ']')) 
                    stack.pop();
                else 
                    return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
}
