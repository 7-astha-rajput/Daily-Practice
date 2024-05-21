class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first 'k' elements
        int n = nums.length;
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        
        double currentSum = maxSum;
        
        // Step 2: Slide the window across the array
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Step 3: Calculate and return the maximum average
        return maxSum / k;
    }
}
