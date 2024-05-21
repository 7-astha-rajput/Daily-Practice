import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;
            if (countMap.getOrDefault(complement, 0) > 0) {
                // Complement found, perform an operation
                countMap.put(complement, countMap.get(complement) - 1);
                operations++;
            } else {
                // Increment the count of the current number
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }
}
