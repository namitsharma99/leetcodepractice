class Problem739DailyTemperatures {
    public int[] dailyTemperatures(int[] temp) {
        
        int len = temp.length;
        int[] answer = new int[len];

        // Arrays.fill(answer,0);

        // if (len <= 1)
        //     return answer;

        // for (int i = 0; i< len; i++) {
        //     int j = i+1;
        //     int nDays = 0;
        //     while (j < len && temp[j] <= temp[i]) {
        //         nDays++;
        //         j++;
        //     }
        //     if (nDays < len && j < len) {
        //         answer[i] = nDays+1;
        //     } else {
        //         answer[i] = 0;
        //     }
        // }

    
        // int slowPtr = 0, fastPtr = 1, index = 0, nDays = 1;

        // while (slowPtr < len-1) {
        //     while (fastPtr < len && temp[fastPtr] <= temp[slowPtr]) {
        //         nDays++;
        //         fastPtr++;
        //     }
        //     if (fastPtr >= len && temp[fastPtr-1] <= temp[slowPtr]) {
        //         nDays = 0;
        //     }
        //     answer[index++] = nDays;
        //     slowPtr++;
        //     fastPtr = slowPtr + 1;
        //     nDays = 1;
        // }

        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < len ; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i-idx;
            }
            stack.push(i);
        }

        return answer;
    }
}
