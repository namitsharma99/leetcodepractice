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
class Problem94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList();
        inOrder(result, root);
        return result;
        
    }

    private void inOrder (List<Integer> result, TreeNode root) {

        if (root == null)
            return;

        inOrder(result, root.left);
        result.add(new Integer(root.val));
        inOrder(result, root.right);

    }
}
