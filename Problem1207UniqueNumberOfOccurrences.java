class Problem1207UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i< arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        //System.out.println("Base map -- ");

        Map<Integer, Integer> occrMap = new HashMap();
        for (int key : map.keySet()) {
            // System.out.println(key + " : " + map.get(key));
            if (occrMap.get(map.get(key)) == null) {
                occrMap.put(map.get(key), 1);
            } else {
                occrMap.put(map.get(key), occrMap.get(map.get(key)) + 1);
            }
            
        }

        //System.out.println("Occr. map -- ");

        for (int key : occrMap.keySet()) {
            //System.out.println(key + " : " + occrMap.get(key));
            if (occrMap.get(key) > 1) {
                return false;
            }
        }

        return true;

    }
}
