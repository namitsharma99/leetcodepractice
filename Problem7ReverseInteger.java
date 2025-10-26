class Problem7ReverseInteger {

    public int reverse(int x) {

        int result = 0;

        // boolean isNeg = false;

        // if (x < 0) {
        //     isNeg = true;
        //     x *= -1;
        // }

        // int n = String.valueOf(x).length();

        // while (x != 0) {

        //     if (result/10 < Integer.MIN_VALUE || result/10 > Integer.MAX_VALUE)
        //         return 0;

        //     result+= Math.pow(10,n-1)*(x%10);
        //     x = x/10;
        //     n--;

        // }
        
        // return isNeg ? result * -1 : result;


        /////////////////////


        while (x!=0) {
            if (result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10)
                return 0;
            result = result*10 + x%10;
            x /= 10;
        }

        return result;
    }
}
