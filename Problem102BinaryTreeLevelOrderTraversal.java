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
class Problem102BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> q = new LinkedList();

        if (root == null)
            return result;
            
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> tempResult = new ArrayList();

            for (int i=0; i < size; i++) {

                TreeNode curr = q.poll();
                tempResult.add(curr.val);
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);

            }
            result.add(tempResult);

        }

        return result;
        
    }
}
