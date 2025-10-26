class Problem191NumberOf1Bits {
    
    public int hammingWeight(int n) {

        int count = 0;

        // will use right shift so checking till number becomes 0
        while (n != 0) {

            // bitwise and operator at the last bit - to make sure it is 1
            if ((n&1) == 1)
                count++;

            // keep shifting right by 1
            n = n >> 1;
        }

        return count;
    }
}
