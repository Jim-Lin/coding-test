import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

    public static void main(String args[]) {
        BinaryTreeLevelOrderTraversalII bt = new BinaryTreeLevelOrderTraversalII();
        TreeNode node3 = bt.new TreeNode(3);
        TreeNode node9 = bt.new TreeNode(9);
        TreeNode node20 = bt.new TreeNode(20);
        TreeNode node15 = bt.new TreeNode(15);
        TreeNode node7 = bt.new TreeNode(7);

        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;

        System.out.println("level order traversal: " + levelOrderBottom(node3));
    }

    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            List<Integer> vals = new LinkedList<Integer>();
            // get size of nodes in the level
            int size = nodes.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.remove();
                vals.add(node.val);

                if (node.left != null) {
                    nodes.add(node.left);
                }

                if (node.right != null) {
                    nodes.add(node.right);
                }
            }

            result.add(0, vals);
        }

        return result;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
