class TreeNode {
    TreeNode left;
    TreeNode right;

    int val;
    TreeNode(int x) { val = x; }

    char operator;
    TreeNode(char x) { operator = x; }
}

public class Q50 {

    public static void main(String args[]) {
        TreeNode node1 = new TreeNode('*');
        TreeNode node2 = new TreeNode('+');
        TreeNode node3 = new TreeNode('+');
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        System.out.println(dfs(node1));
    }

    private static int dfs(TreeNode node) {
        if ((int)node.operator != 0) {
            return calculate(node.operator, dfs(node.left), dfs(node.right));
        } else {
            return node.val;
        }
    }

    private static int calculate(char operator, int left, int right) {
        if (operator == '+') {
            return left + right;
        } else if (operator == '-') {
            return left - right;
        } else if (operator == '*') {
            return left * right;
        } else {
            return left / right;
        }
    }
}
