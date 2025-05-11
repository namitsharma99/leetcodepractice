class Problem1926NearestExitFromEntranceInMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        
        // queue to maintain visited nodes
        // marking the visited as +
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        int[][] directions = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};

        int steps = 0;
        int x,y;

        while (!queue.isEmpty()) {

            steps++;

            int n = queue.size();

            for (int i = 0; i < n; i++) {
                
                int[] current = queue.poll();

                for (int[] direction : directions) {
                    x = current[0] + direction[0];
                    y = current[1] + direction[1];

                    if (x < 0 || x >= maze.length || y < 0 || y >= (maze[0].length))
                        continue;

                    if (maze[x][y] == '+')
                        continue;

                    if (x == 0 || x == (maze.length -1) || y == 0 || y == (maze[0].length-1))
                        return steps;

                    maze[x][y] = '+';
                    queue.offer(new int [] {x, y});
                }
            }

        }

        return -1;

    }
}
