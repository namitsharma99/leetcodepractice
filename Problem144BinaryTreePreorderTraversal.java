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
class Problem144BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList();
        preOrder(result, root);
        return result;
        
    }

    private void preOrder (List<Integer> result, TreeNode root) {

        if (root == null)
            return;

        result.add(new Integer(root.val));
        preOrder(result, root.left);
        preOrder(result, root.right);

    }
}
