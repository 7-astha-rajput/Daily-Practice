import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Number of rooms
        int n = rooms.size();
        
        // To keep track of visited rooms
        boolean[] visited = new boolean[n];
        visited[0] = true;
        
        // Stack for DFS
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        // DFS to visit rooms
        while (!stack.isEmpty()) {
            int currentRoom = stack.pop();
            for (int key : rooms.get(currentRoom)) {
                if (!visited[key]) {
                    visited[key] = true;
                    stack.push(key);
                }
            }
        }
        
        // Check if all rooms are visited
        for (boolean isVisited : visited) {
            if (!isVisited) {
                return false;
            }
        }
        
        return true;
    }
}
