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
class Problem450DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode root, int key) {
        
        if (root == null)
            return null;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null)
                return null;
            if (root.left == null) 
                return root.right;
            if (root.right == null) 
                return root.left;

            TreeNode node = find (root.right);
            root.val = node.val;
            root.right = deleteNode(root.right, node.val);

        }
        return root;
    }

    private TreeNode find(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
