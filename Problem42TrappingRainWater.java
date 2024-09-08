class Problem42TrappingRainWater {

    public int trap(int[] height) {

        if (height.length <= 1) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        int units = 0;

        while (left < right) {


            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(height[left], leftMax);
                units += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(height[right], rightMax);
                units += rightMax - height[right];
            }
            

        }

        return units;
        
    }




}
