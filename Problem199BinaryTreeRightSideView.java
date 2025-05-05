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
class Problem199BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        ArrayList<Integer> result= new ArrayList<>();
        Queue<TreeNode> queue= new LinkedList<>();
        if(root == null){
            return result;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int x= queue.size();
            // System.out.println("x == " + x);
            for(int i=0;i<x;i++){
                TreeNode temp = queue.remove();
                if(i==x-1){
                    result.add(temp.val);
                }
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
        return result;
        
    }



}
