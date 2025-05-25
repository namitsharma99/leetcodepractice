class Problem54SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList();

        int m = matrix.length;
        int n = matrix[0].length;

        int total = m*n;

        int idx = 0;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        
        // using 4 pointers 
        // for grid traversal
        // and boundary checks
        while (left <= right && top <= bottom) {

            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            for (int j = right; j >= left && top<= bottom; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--;

            for (int i = bottom; i >= top && left<= right; i--) {
                result.add(matrix[i][left]);
            }
            left++;

        }

        return result;
    }
}
