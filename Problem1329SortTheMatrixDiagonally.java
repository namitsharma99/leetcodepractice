class Problem1329SortTheMatrixDiagonally {

    public int[][] diagonalSort(int[][] mat) {

        // considering diag. elements, common factor can be established as diff. between i and j

        // for storing and getting elements in sorted manner, consider a queue based data structure like PriorityQueue

        Map<Integer, PriorityQueue<Integer>> map = new HashMap();

        for (int i = 0; i< mat.length; i++) {

            for (int j = 0; j< mat[0].length; j++) {
                
                map.putIfAbsent(i-j , new PriorityQueue<Integer>());
                map.get(i-j).add(mat[i][j]);

            }

        }

        for (int i = 0; i< mat.length; i++) {

            for (int j = 0; j< mat[0].length; j++) {

                mat[i][j] = map.get(i-j).poll();

            }

        }

        return mat;

        
    }
}
