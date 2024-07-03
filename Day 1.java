import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> countMap = new HashMap<>();
        
        for (int[] row : matrix) {
            StringBuilder sb = new StringBuilder(); 
            StringBuilder complement = new StringBuilder();
            for (int num : row) {
                sb.append(num);
                complement.append(1 - num); // Creating the complement of the row
            }
            String rowString = sb.toString();
            String complementString = complement.toString();
            countMap.put(rowString, countMap.getOrDefault(rowString, 0) + 1);
            countMap.put(complementString, countMap.getOrDefault(complementString, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : countMap.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}
