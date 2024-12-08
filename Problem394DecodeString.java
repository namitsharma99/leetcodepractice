class Problem394DecodeString {
    public String decodeString(String s) {
        
        char[] cArr = s.toCharArray();
        Stack<String> stack = new Stack<String>();

        for (char c: cArr) {
        	
        	//System.out.println("Current stack :: " + readStack(stack));
            //System.out.println("Next char :: " + c);
            

            if (c != ']')  {
                stack.push(String.valueOf(c));
            } else {
                String tempStr = "";
                String numStr = "";
                while (!stack.isEmpty() && !stack.peek().equals("[")) {
                    tempStr = stack.peek() + tempStr;
                    stack.pop();
                } 
                //System.out.println("tempStr - " + tempStr);
                stack.pop();
                
                while ( !stack.isEmpty() && ( stack.peek().equals("0") ||
                		stack.peek().equals("1") ||
                		stack.peek().equals("2") ||
                		stack.peek().equals("3") ||
                		stack.peek().equals("4") ||
                		stack.peek().equals("5") ||
                		stack.peek().equals("6") ||
                		stack.peek().equals("7") ||
                		stack.peek().equals("8") ||
                		stack.peek().equals("9") 
                		
                    )) {
                    numStr = stack.peek() + numStr;
                    stack.pop();
                }
                //System.out.println("numStr - " + numStr);
                int num = Integer.valueOf(numStr);
                String temp = "";
                for (int i = 0; i < num; i++) {
                    temp = tempStr + temp;
                }
             
                stack.push(temp);
                
            } 
            //System.out.println("Updated stack :: " + readStack(stack));
            //System.out.println("------------------");
        }

        return readStack(stack);

    }

    private String readStack(Stack<String> stack) {
		Stack<String> temp = (Stack<String>) stack.clone();
        String result = "";
        while (!temp.isEmpty()) {
            result = temp.peek() + result;
            temp.pop();
        }
        return result;
    }
}
