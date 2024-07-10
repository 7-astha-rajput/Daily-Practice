import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        
        // Initialize the queue with all rotten oranges and count fresh oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        // If there are no fresh oranges, return 0 immediately
        if (freshCount == 0) return 0;
        
        // Directions for up, down, left, and right movements
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int timeElapsed = 0;
        
        // Perform BFS
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int time = current[2];
            
            // Spread to adjacent cells
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                // Check if the new position is valid and has a fresh orange
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2;  // Mark as rotten
                    freshCount--;
                    queue.offer(new int[]{newRow, newCol, time + 1});
                    timeElapsed = time + 1;  // Update time
                }
            }
        }
        
        // If there are still fresh oranges left, return -1
        return freshCount == 0 ? timeElapsed : -1;
    }
}
