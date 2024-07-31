class Problem11ContainerWithMostWater {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int max_area = 0;

        while (left < right) {
                int h1 = height[left];
                int h2 = height[right];
                int area = Math.min(h2,h1) * (right-left);
                //System.out.println("left = " + left + ", right = " + right + ", h1 = " + h1 + ", h2 = " + h2 + ", area = " + area);
                if (area > max_area ) {
                    max_area = area;
                }
                //System.out.println("max_area = " + max_area);
                if (h1 < h2) 
                    left++;
                else 
                    right--;
        }

        return max_area;
    }
}
