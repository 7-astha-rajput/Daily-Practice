class Solution {
    public int minChanges(int n, int k) {
        // Check if it's feasible by ensuring all bits set in k are also set in n
        if ((n & k) != k) {
            return -1;
        }
        
        int changes = 0;

        // While loop to check each bit
        while (n > 0 || k > 0) {
            int lastBitN = n & 1; // Extract the last bit of n
            int lastBitK = k & 1; // Extract the last bit of k
            
            // If there's a 1 in n and 0 in k, we need to change that bit
            if (lastBitN == 1 && lastBitK == 0) {
                changes++;
            }
            
            // Shift n and k to the right to check the next bit
            n >>= 1;
            k >>= 1;
        }
        
        return changes;
    }
}
