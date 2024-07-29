class Problem605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] bed, int n) {

        // 1 0 0 0 1
        //     1

        // 0 0 0 0 1
        // 1   1

        // 1 0 0 0 0
        //     1   1

        // 0 0 1 0 1
        // 1


        if (bed.length == 0 && n == 0)
            return true;
        else if (bed.length == 0 && n == 1)
            return false;
        else if (bed.length == 1 && bed[0] == 0 && n == 1)
            return true;
        else if (bed.length == 1 && bed[0] == 1 && n == 0)
            return true;
        else {
            for (int i = 0; i< bed.length; i=i+2) {
                if ((bed[i] == 0 && i == bed.length - 1) || (bed[i] == 0 && bed[i+1] == 0))  {
                    n--;
                } else if (bed[i] == 0 && bed[i+1]==1) {
                    i++;
                } else {
                    continue;
                }
            }
        } 

        if(n<=0)
            return true;
        else 
            return false;



  /*    int max_zeroes = 0;

        int count = 0;

        for (int i=0; i< flowerbed.length; i++) {
            if (flowerbed[i]==0) {
                count++;
                if (count > max_zeroes) {
                    max_zeroes = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println("max_zeroes == " + max_zeroes);

        if (2*n <= max_zeroes)
            return true;
        else 
            return false; */


    }

        
    
}
