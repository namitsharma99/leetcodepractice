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
class Problem700SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {

        // int[] result = new int[3];

        // TreeNode node = findNode(root, val);

        // if (node == null)
        //     return new int[0];
        // else {
        //     result[0] = node.val;

        //     if (node.left != null)
        //         result[1] = node.left.val;

        //     if (node.right != null)
        //         result[2] = node.right.val;
        // }

        // return result;

        return findNode(root, val);

    }

    private TreeNode findNode (TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val == val) 
            return root;
        else if (root.val > val)
            return findNode(root.left, val);
        else 
            return findNode(root.right, val);

    }

}
