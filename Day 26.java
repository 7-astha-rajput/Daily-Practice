import java.util.*;

class Solution {
    public int minReorder(int n, int[][] connections) {
        // Step 1: Create adjacency lists for both directed and reverse edges
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] conn : connections) {
            graph.get(conn[0]).add(new int[]{conn[1], 1}); // original direction
            graph.get(conn[1]).add(new int[]{conn[0], 0}); // reverse direction
        }

        // Step 2: BFS from city 0
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.offer(0);
        visited[0] = true;
        int reorders = 0;

        while (!queue.isEmpty()) {
            int city = queue.poll();
            for (int[] neighbor : graph.get(city)) {
                int nextCity = neighbor[0];
                int direction = neighbor[1];
                if (!visited[nextCity]) {
                    visited[nextCity] = true;
                    queue.offer(nextCity);
                    reorders += direction; // count reorientation needed
                }
            }
        }

        return reorders;
    }
}
