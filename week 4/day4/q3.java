class Solution {

    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode root) {

        if (root == null)
            return 0;

        int leftGain = Math.max(0, dfs(root.left));
        int rightGain = Math.max(0, dfs(root.right));

        // Maximum path passing through current node
        int currentPath = root.val + leftGain + rightGain;

        maxSum = Math.max(maxSum, currentPath);

        // Return one side to parent
        return root.val + Math.max(leftGain, rightGain);
    }
}