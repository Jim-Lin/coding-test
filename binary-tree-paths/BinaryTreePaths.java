import java.util.List;
import java.util.ArrayList;

public class BinaryTreePaths {

    public static void main(String args[]) {
        BinaryTreePaths btp = new BinaryTreePaths();
        TreeNode node5 = btp.new TreeNode(5);
        TreeNode node3 = btp.new TreeNode(3);
        TreeNode node2 = btp.new TreeNode(2);
        TreeNode node1 = btp.new TreeNode(1);

        node2.right = node5;
        node1.right = node3;
        node1.left = node2;

        System.out.println("binary tree paths: " + binaryTreePaths(node1));
    }

    private static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        searchBT(root, "", paths);

        return paths;
    }

    private static void searchBT(TreeNode node, String path, List<String> paths) {
        String val = String.valueOf(node.val);

        if (node.left == null && node.right == null) {
            paths.add(path + val);
        } else {
            searchBT(node.left, path + val + "->", paths);
            searchBT(node.right, path + val + "->", paths);
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
