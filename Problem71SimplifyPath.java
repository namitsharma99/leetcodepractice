class Problem71SimplifyPath {

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack();

        String[] arr = path.split("/");

        for (String s : arr) {

            if (s.isEmpty() || s.equals("."))
                continue;

            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                } 
            }else {
                stack.push(s);
            }
        }

        String result = "";
        while (!stack.isEmpty()) {
            result = "/" + stack.pop() + result;
        }
        
        return result.isEmpty() ? "/" : result;
    }
}
