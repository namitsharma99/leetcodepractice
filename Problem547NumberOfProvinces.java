class Problem547NumberOfProvinces {


    public int findCircleNum(int[][] arr) {


        boolean[] visited = new boolean[arr.length];
        int count = 0;
        
        for (int i = 0; i < arr.length; i++ ) {
            if (!visited[i]) {
                count++;
                dfs(i, arr, visited);
            }
        }

        return count;

    }

    private void dfs (int node, int[][] connectedArr, boolean[] visited) {

        visited[node] = true;

        for (int neighbour = 0; neighbour < visited.length; neighbour++) {

            if (connectedArr[node][neighbour] == 1 && !visited[neighbour]) {
                dfs(neighbour, connectedArr, visited);
            }

        }

    }




}
