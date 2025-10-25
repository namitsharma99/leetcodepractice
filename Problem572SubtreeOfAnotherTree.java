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
class Problem572SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null || subRoot == null)
            return false;

        // int subRootVal = subRoot.val;

        // TreeNode foundNode = null;
        // foundNode = traverseMain(root, subRoot, foundNode);

        // if (foundNode == null)
        //     return false;
        // else 
        //     return checkTree(foundNode, subRoot);

        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (checkTree(curr, subRoot)) {
                return true;
            }
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
        return false;
        
    }

    // private TreeNode traverseMain(TreeNode root, TreeNode subRoot, TreeNode foundNode) {
    //     if (root == null)
    //         return null;
        
    //     if (root.val == subRoot.val)
    //         foundNode = root;

    //     traverseMain(root.left, subRoot, foundNode);
    //     traverseMain(root.right, subRoot, foundNode);

    //     return foundNode;
    // }

    private boolean checkTree(TreeNode foundNode, TreeNode subRoot) {
        
        if (foundNode == null && subRoot == null)
            return true;

        if ((foundNode == null && subRoot != null) || (foundNode != null && subRoot == null))
            return false;

        return 
               (foundNode.val == subRoot.val)
               &&
               checkTree(foundNode.left, subRoot.left)
                &&
               checkTree(foundNode.right, subRoot.right);

    }


}
