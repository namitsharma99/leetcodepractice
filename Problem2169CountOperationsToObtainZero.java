class Problem2169CountOperationsToObtainZero {
  
    public int countOperations(int num1, int num2) {
        
        int count = 0;
        if (num1 == 0 || num2 == 0)
            return 0;

        while (num1 - num2 != 0) {
            if (num1 < num2) {
                num2 = num2 - num1;
                count++;
            } else {
                num1 = num1 - num2;
                count++;
            }
        }

        return count+1;

    }
}
