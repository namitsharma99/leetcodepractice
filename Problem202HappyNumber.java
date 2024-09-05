class Problem202HappyNumber {
    public boolean isHappy(int n) {
        
        //int[] arr = new int[n/10 + 1];
        //int idx = 0;
        // int sum = sumOfSquares(n);
        // System.out.println("Inital sum : " + sum);
        // while (sum != 1) {
        //     sum = sumOfSquares(sum);
        //     System.out.println("Sum : " + sum);
        // }

        // if (sum == 1) 
        //     return true;
        // else 
        //     return false;

        int p1 = sumOfSquares(n);
        int p2 = sumOfSquares(sumOfSquares(n));

        while (p1 != p2) {    
            p1 = sumOfSquares(p1);
            p2 = sumOfSquares(sumOfSquares(p2));
        }

        return p1 == 1;

        
    }

    private int sumOfSquares(int n) {

        //System.out.println("n : " + n);

        if (n/10 == 0)
            return (int)Math.pow(n, 2);

        double sum = 0;
        while (n/10 != 0) {
            sum += Math.pow(n%10, 2);
            n = n/10;
            //System.out.println("n : " + n);
        }
        sum += Math.pow(n%10, 2);

        //System.out.println("------------------");
        return (int)sum;
    }
}


// 2 - 4 - 16 - 37 - 58 - 89 - 
