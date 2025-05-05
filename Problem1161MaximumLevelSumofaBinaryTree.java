/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Problem1161MaximumLevelSumofaBinaryTree {
    public int maxLevelSum(TreeNode root) {
        
        
        int levelMax = 0;
        int sumMax = Integer.MIN_VALUE;

        Queue<TreeNode> queue = new LinkedList();

        if (root == null) {
            return levelMax;
        }

        queue.add(root);
        
        int level = 0;

        while (!queue.isEmpty()) {

            level++;
            int size = queue.size();
            int sum = 0;
            TreeNode temp = null;

            for (int i=0; i< size; i++) {
                temp = queue.remove();
                sum += temp.val;

                // System.out.println("Level: " +  level + " | Temp: " + temp.val + " | Sum: " + sum);
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }

            if (sum > sumMax) {
                sumMax = sum;
                levelMax = level;
            }

        }

        return levelMax;
    }
}
