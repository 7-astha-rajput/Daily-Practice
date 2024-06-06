import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Create a min-heap with the first k elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        
        // Process the remaining elements in the array
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();  // Remove the smallest element
                minHeap.add(nums[i]);  // Add the current element
            }
        }
        
        // The root of the heap is the kth largest element
        return minHeap.peek();
    }
}
