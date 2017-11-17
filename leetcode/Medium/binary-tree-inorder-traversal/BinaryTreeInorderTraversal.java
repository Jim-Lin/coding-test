import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static void main(String args[]) {
        BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();
        TreeNode node1 = tree.new TreeNode(1);
        TreeNode node2 = tree.new TreeNode(2);
        TreeNode node3 = tree.new TreeNode(3);

        node1.right = node2;
        node2.left = node3;

        System.out.println("inorder traversal: " + inorderTraversal(node1));
    }

    // iterative
    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;

                continue;
            }

            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;
    }

    // recursive
    // private static void traverseBT(TreeNode node, List<Integer> result) {
    //     if (node == null) {
    //         return;
    //     }
    //
    //     traverseBT(node.left, result);
    //     result.add(node.val);
    //     traverseBT(node.right, result);
    // }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
