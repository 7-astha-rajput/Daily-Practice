class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // This pointer keeps track of the position of the next non-zero element

        // Move all non-zero elements to the front of the array
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                nums[lastNonZeroFoundAt] = nums[current];
                lastNonZeroFoundAt++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
