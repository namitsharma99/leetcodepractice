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
class Problem662MaximumWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {

        // Queue<Object[][]> queue = new Deque();
        // // 2 elements array for storing element and its assigned index
        // queue.push({(TreeNode)root, (Integer)0});

        // int maxWidth = Integer.MIN_VALUE;

        // while (!queue.isEmpty()) {

        //     // left and right index
        //     int left = queue.front()[1];
        //     int right = queue.front()[2];

        //     maxWidth = Math.min(maxWidth, right-left+1);

        //     int n = queue.size();

        //     while (n> 0) {

        //         TreeNode curr
        //         n--;
        //     }

        // } // To be continued...


        // Approach 2

        if (root == null) {
            return 0;
        }

        long maxWidth = (long)Integer.MIN_VALUE;

        Deque<Node> queue = new LinkedList<>();

        queue.offer(new Node(root, 0L));


        while (!queue.isEmpty()) {
            int n = queue.size();
            
            // left and right index
            long left = queue.peekFirst().getIndex();
            long right = queue.peekLast().getIndex();

            if ((long)maxWidth < right-left+1)
                maxWidth = right-left+1;

            for (int i = 0; i< n; i++) {

                Node node = queue.pollFirst();

                if (node.treeNode.left != null)
                    queue.add(new Node(node.getTreeNode().left, 2*node.getIndex() ));

                if (node.treeNode.right != null)
                    queue.add(new Node(node.getTreeNode().right, 2*node.getIndex() + 1));
            }

        }

        return (int)maxWidth;


    }

}

class Node {

    TreeNode treeNode;
    Long index;

    public Node() {}

    public Node(TreeNode treeNode, Long index) {
        this.treeNode = treeNode;
        this.index = index;
    }

    public TreeNode getTreeNode() {
        return this.treeNode;
    }

    public Long getIndex() {
        return this.index;
    }

}
