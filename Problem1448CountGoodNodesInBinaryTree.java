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
class Problem1448CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        
        if (null == root)
            return 0;

        return checkMax(root, root.val);
    }

    private int checkMax (TreeNode node, int max) {

        if (null == node)
            return 0;

        max = Math.max(node.val, max);

        if (max <= node.val)
            return checkMax(node.left, max) + checkMax(node.right, max) + 1;
        else 
            return checkMax(node.left, max) + checkMax(node.right, max);
    }
}
