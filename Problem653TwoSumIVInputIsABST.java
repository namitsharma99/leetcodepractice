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
class Problem653TwoSumIVInputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return traverse(root, k, set);
    }

    private boolean traverse(TreeNode root, int k, Set<Integer> set) {

        if (root == null)
            return false;

        int searchElement = k - root.val;

        if (set.contains(searchElement))
            return true;

        set.add(root.val);

        return traverse(root.left, k, set) || traverse(root.right, k, set);

    }

}
