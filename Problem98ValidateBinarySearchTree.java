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
class Problem98ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        
        if (root == null)
            return true;

        return helper(root,
                      Long.MIN_VALUE,
                      Long.MAX_VALUE);

    }

    private boolean helper (TreeNode node, Long min, Long max) {
        if (node == null)
            return true;

        // validate against the range
        if (node.val <= min || node.val >= max)
            return false;
        
        // capping the max limit for left, per parent node
        // capping the min limit for right, per parent node

        return helper(node.left, min, Long.valueOf(node.val)) &&
               helper(node.right, Long.valueOf(node.val), max);

        // Note - Long is used for handling testcases like:
        // root =
        //      [2147483647]
    }
}
