class Problem841KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int nRooms = rooms.size();

        if (nRooms == 0)
            return false;

        int[] arrVisit = new int[nRooms];

        dfs(rooms, arrVisit, 0);

        for (int i=0; i< nRooms; i++) {
            if (arrVisit[i] != 1)
                return false;
        }

        return true;

    }

    private void dfs(List<List<Integer>> rooms, int[] arrVisit, int room) {
        arrVisit[room] = 1;

        //System.out.println("dfs room -- " + room);
        //System.out.println("rooms.get(room) -- " + rooms.get(room));
        //System.out.println("arrVisit[room] -- " + arrVisit[room]);

        for (int key : rooms.get(room)) {
            //System.out.println("key -- " + key);
            //System.out.println("arrVisit[key] -- " + arrVisit[key]);
            if (arrVisit[key]!=1) {
                dfs(rooms, arrVisit, key);
            }
        }
    }
}
