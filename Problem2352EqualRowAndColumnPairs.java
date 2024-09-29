class Problem2352EqualRowAndColumnPairs {
    
    public int equalPairs(int[][] grid) {

        int n = grid.length;
        int count = 0;
        Map<String, Integer> map = new HashMap();
        
        for (int i = 0; i < n; i++) {
            String iText = "";
            for (int j = 0; j < n; j++) {
                iText += grid[i][j]+",";
            }
            if (map.get(iText) != null )
                map.put(iText, map.get(iText) + 1 );
            else 
                map.put(iText,  1 );

            //System.out.println(iText);
        }

        //System.out.println(map);
        //System.out.println("-------------------------");

        for (int j = 0; j < n; j++) {
            String jText = "";
            for (int i = 0; i < n; i++) {
                jText += grid[i][j] + ",";

                if (map.get(jText) != null && map.get(jText) > 0) {
                    // map.put(jText, map.get(jText)-1  );
                    count += map.get(jText);
                }

            }
            //System.out.println(jText);
        }

        return count;

    }
}
