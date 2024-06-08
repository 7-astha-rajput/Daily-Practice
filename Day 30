import java.util.PriorityQueue;

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        // Priority queues to maintain the min-heaps for the first and last `candidates` workers
        PriorityQueue<int[]> firstHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> lastHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        int n = costs.length;
        int totalCost = 0;

        // Fill the first heap with the first `candidates` workers
        for (int i = 0; i < candidates && i < n; i++) {
            firstHeap.offer(new int[]{costs[i], i});
        }
        
        // Fill the last heap with the last `candidates` workers
        for (int i = n - 1; i >= n - candidates && i >= 0; i--) {
            lastHeap.offer(new int[]{costs[i], i});
        }

        // To avoid overlap, the starting index should be the end of the first segment
        // and the ending index should be the start of the last segment
        int start = candidates; // Next index to be added to the first heap
        int end = n - candidates - 1; // Next index to be added to the last heap

        for (int i = 0; i < k; i++) {
            // Remove duplicates between heaps
            while (!firstHeap.isEmpty() && !lastHeap.isEmpty() && firstHeap.peek()[1] == lastHeap.peek()[1]) {
                lastHeap.poll();
            }

            if (lastHeap.isEmpty() || (!firstHeap.isEmpty() && firstHeap.peek()[0] <= lastHeap.peek()[0])) {
                int[] minWorker = firstHeap.poll();
                totalCost += minWorker[0];
                
                if (start < n && start <= end) {
                    firstHeap.offer(new int[]{costs[start], start});
                    start++;
                }
            } else {
                int[] minWorker = lastHeap.poll();
                totalCost += minWorker[0];
                
                if (end >= 0 && end >= start) {
                    lastHeap.offer(new int[]{costs[end], end});
                    end--;
                }
            }
        }
        
        return totalCost;
    }
}
