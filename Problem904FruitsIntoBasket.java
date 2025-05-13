class Problem904FruitsIntoBasket {

    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> result = new HashMap();

        int left = 0;
        int right = 0;
        int max = 0;

        while (right < fruits.length) {

            int treeType = fruits[right];
            if (result.get(treeType) != null) {
                result.put(treeType, result.get(treeType) + 1 );
            } else {
                result.put(treeType, 1 );
            }
            
            while (result.size() > 2) {
                int count = result.get(fruits[left]);
                if (count == 1)
                    result.remove(fruits[left]);
                else 
                    result.put(fruits[left], result.get(fruits[left]) - 1 );
                
                left++;
            }

            max = Math.max(max, right -left +1);
            right++;
        }

        return max;
 
    }
}
