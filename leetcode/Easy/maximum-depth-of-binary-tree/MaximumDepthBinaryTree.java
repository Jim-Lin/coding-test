public class MaximumDepthBinaryTree {

    public static void main(String args[]) {
        MaximumDepthBinaryTree tree = new MaximumDepthBinaryTree();
        TreeNode node1 = tree.new TreeNode(1);
        TreeNode node2 = tree.new TreeNode(2);
        TreeNode node3 = tree.new TreeNode(3);
        TreeNode node4 = tree.new TreeNode(4);
        TreeNode node5 = tree.new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println("maximum depth of binary tree is " + maxDepth(node1));
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
