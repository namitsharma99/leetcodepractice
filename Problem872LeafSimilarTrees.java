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
class Problem872LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> l1 = new ArrayList();
        sequence(l1, root1);
        //System.out.println(l1);

        List<Integer> l2 = new ArrayList();
        sequence(l2, root2);
        //System.out.println(l2);

        if (l1.size() != l2.size()) {
            return false; 
        } else {
            //System.out.println("same size --- ");
            for (int i = 0; i< l1.size(); i++) {
                if (l1.get(i) - l2.get(i) != 0) {
                    //System.out.println("mismatch === " +  l1.get(i)  + " ;;; " + l2.get(i) );
                    return false;
                }
            }
            return true;
        }

    
    }

    private void sequence (List<Integer> ls, TreeNode root) {

        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null) {
            // str = String.valueOf(root.val) + ",";
            ls.add(root.val);
        } else {
            // str = String.valueOf(sequence(root.left)) + String.valueOf(sequence(root.right));
            sequence(ls, root.left);
            sequence(ls, root.right);
        } 

    }
}
