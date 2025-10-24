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
class Problem103BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList();

        if (root == null)
            return result;

        // For level order traversal : Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean isLeftToRight = false;

        while (!queue.isEmpty()) {

            // From left to right  :  List
            // From right to left  :  Stack

            List<Integer> list = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                if (!isLeftToRight) {
                    // System.out.println("Node: " + node.val +  " in list" );
                    list.add(node.val);
                } else {
                    // System.out.println("Node: " + node.val +  " in stack" );
                    stack.push(node.val);
                }

                // handling children of the nodes
                if (node.left!=null)
                    queue.add(node.left);
                
                if(node.right!=null)
                    queue.add(node.right);

            }

            // toggling the flag
            isLeftToRight = !isLeftToRight;


            // emptying the stack into the same list to get the reverse-ordered elements
            while(!stack.isEmpty())
                list.add(stack.pop());

            // adding the list ready by end of this iteration in the result
            result.add(list);

        }

        return result;
        


    }

























    // public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

    //     List<List<Integer>> result = new ArrayList();
    //     boolean leftRight = false;

    //     if (root == null)
    //         return result;
    //     else {
    //         List<Integer> innerList = new ArrayList();
    //         innerList.add(root.val);
    //         result.add(innerList);
    //     } 

        
    //     zigZag(root, result, leftRight);

    //     return result;

        
    // }

    // private void zigZag(TreeNode node, List<List<Integer>> list, boolean leftRight) {

    //     if (node == null)
    //         return;

    //     TreeNode left = node.left;
    //     TreeNode right = node.right;

    //     List<Integer> innerList = new ArrayList();
        
    //     if (leftRight) {
    //         if (left != null)
    //             innerList.add(left.val);
    //         if (right != null)
    //             innerList.add(right.val);
    //     } else {
    //         if (right != null)
    //             innerList.add(right.val);
    //         if (left != null)
    //             innerList.add(left.val);
    //     }

    //     leftRight = !leftRight;

    //     if (!innerList.isEmpty())
    //         list.add(innerList);

    //     if (left != null) {
    //         zigZag(left, list, leftRight);
    //     }

    //     if (right != null) {
    //          zigZag(right, list, leftRight);
    //     }
    // }
}
