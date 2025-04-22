class Problem763PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        
        // using 2 pointers respectively: 
        // 1. to find the last occr. of a letter
        // 2. manage the partition hook

        int[] lastOccrArray = new int[26];
        List<Integer> result = new ArrayList();

        for (int i = 0 ; i < s.length(); i++) {
            lastOccrArray[s.charAt(i) - 'a'] = i;
        }

        int start = 0, end = 0;

        for (int i = 0; i< s.length(); i++) {

            int idx = lastOccrArray[s.charAt(i) - 'a'];
            end = end >= idx ? end : idx; // store the max value of end

            if (i == end) {
                result.add(i - start + 1);
                start = i+1;
            }

        }

        return result;


    }

}
