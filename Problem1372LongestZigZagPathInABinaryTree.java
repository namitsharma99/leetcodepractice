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
class Problem1372LongestZigZagPathInABinaryTree {

    int maxLen = 0;

    public int longestZigZag(TreeNode root) {

        if (root == null)
            return 0;

        getSum(root.left , false, 1);
        getSum(root.right, true , 1);

        return maxLen;

    
    }

    private void getSum(TreeNode node, boolean isRight, int occr) {
        if (node == null)
            return;

        maxLen = Math.max(maxLen, occr);

        getSum(node.left, false, isRight? occr+1:1);
        getSum(node.right, true, !isRight? occr+1:1);

    }


}
