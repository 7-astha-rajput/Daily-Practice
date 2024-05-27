import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count occurrences of each value
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Check for unique occurrence counts
        Set<Integer> occurrenceSet = new HashSet<>();
        for (int count : occurrenceMap.values()) {
            if (!occurrenceSet.add(count)) {
                return false; // Duplicate occurrence count found
            }
        }
        
        return true; // All occurrence counts are unique
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example test cases
        System.out.println(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3})); // Output: true
        System.out.println(solution.uniqueOccurrences(new int[]{1, 2})); // Output: false
        System.out.println(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})); // Output: true
    }
}
