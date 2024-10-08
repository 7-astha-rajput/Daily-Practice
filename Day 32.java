import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        
        Arrays.sort(potions);


        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            long requiredStrength = (long) Math.ceil((double) success / spell);
            int index = binarySearch(potions, requiredStrength);
            pairs[i] = m - index;
        }
        
        return pairs;
    }
    
    private int binarySearch(int[] potions, long requiredStrength) {
        int low = 0;
        int high = potions.length;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (potions[mid] < requiredStrength) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
}
