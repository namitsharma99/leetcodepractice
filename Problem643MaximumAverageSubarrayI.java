class Problem643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        
        if (k> nums.length)
            return 0.0d;

        // Advanced approach - Memoization.

        int max = 0;
        int sum = 0;
        for (int i = 0; i< k; i++) {
            sum += nums[i];
        }
        
       // double avg = 0.00000d;
        max = sum;
        //System.out.println("first sum = " + max);

        int oldIdx = 0;
        for (int i = k; i< nums.length; i++) {

            sum -= nums[oldIdx];
            sum += nums[i];
            oldIdx++;

            //System.out.println("next sum = " + sum);

            max = sum > max ? sum : max;

            //System.out.println("next max = " + max);

        }

        // return  (max * Math.pow(10,5) )/ (k * Math.pow(10,5));
        return (double)max/k;


        // Basic approach O(N)

        /* 
        double max_avg = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length-k; i++) {
            int sum = 0;
            int counter = 0;
            while (counter < k)  {   
                //System.out.println("i = " + i + " , counter : " + counter) ;   
                //System.out.println("nums[i+k] :: " + nums[i+counter]);
  
                sum += nums[i+counter];
                counter++;
            }

            double avg = (sum * Math.pow(10,5) )/ (k * Math.pow(10,5)) ;
            if (max_avg < avg) 
                max_avg = avg;

            //System.out.println(avg);
        }
        // return Double.valueOf(dfZero.format(max_avg));
        return max_avg;

        */
    }
}
