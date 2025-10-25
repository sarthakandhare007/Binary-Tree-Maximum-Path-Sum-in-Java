class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class MaxPathSumBinaryTree {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxSum;
    }

    private int findMax(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, findMax(node.left));  // ignore negative paths
        int right = Math.max(0, findMax(node.right));

        // Possible best path passing through this node
        maxSum = Math.max(maxSum, node.val + left + right);

        // Return max one-side path including this node
        return node.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxPathSumBinaryTree solver = new MaxPathSumBinaryTree();
        System.out.println("Maximum Path Sum: " + solver.maxPathSum(root)); // Output: 42
    }
}
