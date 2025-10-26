class Problem1009ComplementOfBase10Integer {

    public int bitwiseComplement(int n) {

        if (n == 0)
            return 1;

        int num = n, mask = 0;

        while (num != 0) { // to get the number of digits
            mask = mask << 1 | 1;
            num = num >> 1;
        }

        n = ~n & mask;

        return n;
        
    }
}
