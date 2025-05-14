class Problem994RottingOranges {

    public int orangesRotting(int[][] grid) {
        
        // m x n
        int m = grid.length;
        int n = grid[0].length;
        int maxTime = 0;

        Queue<Cell> queue = new LinkedList<Cell>();

        int freshOranges = 0;
        int[][] visitedBaskets = new int[m][n];

        // setting positions of the initially rotten oranges
        //  0 representing an empty cell
        //  1 representing a fresh orange
        //  2 representing a rotten orange.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                if (grid[i][j] == 2) {
                    // at time t = 0 
                    queue.offer(new Cell(i,j,0));
                    visitedBaskets[i][j]= 2;
                } 
                if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0)
            return 0;

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int count = 0;

        while(!queue.isEmpty()) {
            Cell current = queue.poll();
            int r = current.row;
            int c = current.column;
            int t = current.time;
            maxTime = Math.max(maxTime, t);

            for (int i=0; i< 4; i++) {
                int newR = r + dr[i];
                int newC = c + dc[i];
                if (newR >= 0 && newR < m && newC >=0 && newC < n
                    && visitedBaskets[newR][newC] == 0 && grid[newR][newC] == 1) {
                        queue.offer(new Cell(newR, newC, t+1));
                        visitedBaskets[newR][newC] = 2;
                        count++;
                    }
            }
        }

        if (count != freshOranges)
            return -1;

        return maxTime;

    }
}

class Cell {

    int row;
    int column;
    int time;

    public Cell (int row, int column, int time) {
        this.row = row;
        this.column = column;
        this.time = time;
    }

}
