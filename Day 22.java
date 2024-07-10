class Solution {
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, Integer.MIN_VALUE);
    }

    private int countGoodNodes(TreeNode node, int maxSoFar) {
        if (node == null) {
            return 0;
        }

        int goodNodes = 0;
        if (node.val >= maxSoFar) {
            goodNodes = 1;
        }

        maxSoFar = Math.max(maxSoFar, node.val);

        goodNodes += countGoodNodes(node.left, maxSoFar);
        goodNodes += countGoodNodes(node.right, maxSoFar);

        return goodNodes;
    }
}
