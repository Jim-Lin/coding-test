// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static void main(String args[]) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);
        System.out.println("root val is " + root.val);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeNode(preorder, inorder, 0, inorder.length - 1, 0);
    }

    private static TreeNode buildTreeNode(int[] preorder, int[] inorder, int inStart, int inEnd, int preIndex) {
        if (preIndex == preorder.length || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex]);

        int inIndex = inStart;
        for (; inIndex <= inEnd; inIndex++) {
            if (inorder[inIndex] == preorder[preIndex]) {
                break;
            }
        }

        root.left = buildTreeNode(preorder, inorder, inStart, inIndex - 1, preIndex + 1);
        root.right = buildTreeNode(preorder, inorder, inIndex + 1, inEnd, preIndex + (inIndex - inStart + 1));

        return root;
    }
}
