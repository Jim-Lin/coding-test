import java.util.Queue;
import java.util.LinkedList;

public class Q3 {

    public static void main(String args[]) {
        Q3 tree = new Q3();
        TreeNode node1 = tree.new TreeNode(1);
        TreeNode node2 = tree.new TreeNode(2);
        TreeNode node3 = tree.new TreeNode(3);

        node1.right = node2;
        node2.left = node3;

        String s = serialize(node1);
        System.out.println(s);

        TreeNode root = deserialize(s);
        System.out.println(root.right.left.val);
    }

    // BFS
    private static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append("null,");
            } else {
                sb.append(String.valueOf(node.val) + ",");
            }

            if (node != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return sb.substring(0, sb.length() - 1);
    }

    private static TreeNode deserialize(String s) {
        Q3 tree = new Q3();
        String[] values = s.split(",");
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode root = tree.new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);

        for (int i = 1; i < values.length; i++) {
            TreeNode node = queue.poll();

            if (values[i].equals("null")) {
                node.left = null;
            } else {
                node.left = tree.new TreeNode(Integer.parseInt(values[i]));
                queue.add(node.left);
            }

            i++;
            if (values[i].equals("null")) {
                node.right = null;
            } else {
                node.right = tree.new TreeNode(Integer.parseInt(values[i]));
                queue.add(node.right);
            }
        }

        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
