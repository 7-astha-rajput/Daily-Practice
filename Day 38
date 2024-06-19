class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        
        int n = nums.length;
        int[] dp = new int[n];
        
        // Initialize the base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        // Fill the dp array using the recurrence relation
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        
        // The answer will be in dp[n-1]
        return dp[n-1];
    }
}
