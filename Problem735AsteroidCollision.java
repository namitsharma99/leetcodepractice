class Problem735AsteroidCollision {
    
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack ();

        for (int ast : asteroids) {

            // all positive - just add
            if (ast > 0) {
                stack.push(ast);
            } else {
            // check for negatives 

                // peek for positives and eliminate if size is lesser than negatives, repeat
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < ast * -1) {
                    stack.pop();
                }

                // if stack is empty, just push the negative
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(ast);
                } else if (stack.peek() == ast * -1) {
                // if stack is not empty, peek and check if postive is of same size
                    stack.pop();
                }

            }

        }

        
        int i = stack.size();
        int[] result = new int [i];

        while (!stack.isEmpty()) {
            result[i-1] = stack.peek();
            stack.pop();
            i--;
        }

        return result;

    }


}
