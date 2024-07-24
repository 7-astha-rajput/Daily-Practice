import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;

        Arrays.sort(nums); // Step 1: Sort the array

        // Step 2: Iterate through the array with two nested loops
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip duplicate elements for the first fixed element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip duplicate elements for the second fixed element
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1; // Start the third pointer just after the second fixed element
                int right = nums.length - 1; // Start the fourth pointer at the end of the array

                // Step 3: Use two pointers to find the remaining two elements
                while (left < right) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicate elements for the third and fourth pointers
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Move the left pointer to the right to increase the sum
                    } else {
                        right--; // Move the right pointer to the left to decrease the sum
                    }
                }
            }
        }

        return result; // Step 5: Return the result list of quadruplets
    }
}
