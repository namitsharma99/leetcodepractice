class Problem204CountPrimes {

    public int countPrimes(int n) {

        // TLE 
        // int count = 0;
        // for (int i = 0; i<n; i++) {
        //     if(isPrime(i)) 
        //         count++;
        // }
        // return count;

        // Sieve of Eratosthenes
        boolean[] primes = new boolean[n+1];
        // starting with assumption that all numbers are prime
        Arrays.fill(primes, true);

        int count = 0;

        for (int i = 2; i<n; i++) {
            if (primes[i]) {
                count++;
                for (int j = i*2; j<n; j = j+i) {
                    primes[j] = false;
                }
            }
        }

        return count;
        
    }

    // TLE
    private boolean isPrime(int n) {

        if (n == 0 || n == 1)
            return false;

        for (int i = 2; i<= n/2; i++) {
            if(n%i==0)
                return false;
        }

        return true;

    }
}
