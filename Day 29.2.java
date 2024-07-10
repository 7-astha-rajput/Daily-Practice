import java.util.*;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        
        // Combine nums1 and nums2 into pairs
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }
        
        // Sort pairs by nums2 values in descending order
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);
        
        // Min-heap to maintain the k largest values from nums1
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0;
        long maxScore = 0;
        
        for (int i = 0; i < n; i++) {
            int num1 = pairs[i][0];
            int num2 = pairs[i][1];
            
            // Add current nums1 value to the heap
            minHeap.add(num1);
            sum += num1;
            
            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                sum -= minHeap.poll();
            }
            
            // If the heap has exactly k elements, calculate the score
            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * num2);
            }
        }
        
        return maxScore;
    }
}
