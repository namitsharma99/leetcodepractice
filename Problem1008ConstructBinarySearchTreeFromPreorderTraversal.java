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
class Problem1008ConstructBinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {

        int len = preorder.length;

        if (preorder == null || len < 1)
            return null;

        TreeNode root = new TreeNode(preorder[0]);

        if (len == 1 )
            return root;

        for (int i = 1; i< len; i++) {

            int curr = preorder[i];
            populateTree(root, curr);

        }

        return root;

    }

    private void populateTree (TreeNode root, int curr) {
        while (true) {
            if (root.val >= curr) { // move to left
                if (root.left == null) {
                    root.left = new TreeNode(curr);
                    break;
                }
                root = root.left;
            } else { // move to right
                if (root.right == null) {
                    root.right = new TreeNode(curr);
                    break;
                }
                root = root.right;
            }
        }
    }
}
