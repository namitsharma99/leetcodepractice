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
class Problem437PathSumIII {

    int occr = 0;

    public int pathSum(TreeNode root, int targetSum) {
        
        if (root == null)
            return 0;

        // if (root.val == targetSum)
        //     return 1;

        getSum(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return occr;

    }

    private void getSum(TreeNode node, int target, long sum) {
        if (node == null) 
            return;

        sum += node.val;

        if (sum == target) {
            occr++;
        }

        getSum(node.left, target, sum);
        getSum(node.right, target, sum);

    }
}
