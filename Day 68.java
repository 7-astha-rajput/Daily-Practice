class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int currentNumber) {
        if (node == null) {
            return 0;
        }
        
        // Update the current number
        currentNumber = currentNumber * 10 + node.val;
        
        // If it's a leaf node, return the current number
        if (node.left == null && node.right == null) {
            return currentNumber;
        }
        
        // Recursively call DFS on left and right children
        int leftSum = dfs(node.left, currentNumber);
        int rightSum = dfs(node.right, currentNumber);
        
        // Return the sum of both left and right subtree sums
        return leftSum + rightSum;
    }
}
