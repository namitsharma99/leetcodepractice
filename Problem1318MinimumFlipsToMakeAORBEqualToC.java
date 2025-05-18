class Problem1318MinimumFlipsToMakeAORBEqualToC {

    public int minFlips(int a, int b, int c) {

        int counter = 0;

        for (int i = 0; i< 32; i++) {

            int a_curr = a & 1;
            int b_curr = b & 1;
            int c_curr = c & 1;

            if ((a_curr | b_curr) != c_curr) {
                
                if (a_curr == 1 && b_curr == 1) {
                    counter++;
                }

                counter++;
            
            }

            a = a>>1;
            b = b>>1;
            c = c>>1;

        }

        return counter;
        
    }
}
