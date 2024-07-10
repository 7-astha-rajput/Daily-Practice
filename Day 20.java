import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Using a stack to handle collisions
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean isDestroyed = false;
            
            // Handle collisions if current asteroid is moving left
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > Math.abs(stack.peek())) {
                    stack.pop();  // Pop the top element as it's destroyed
                } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
                    stack.pop();  // Both asteroids destroy each other
                    isDestroyed = true;
                    break;
                } else {
                    isDestroyed = true;  // Current asteroid is destroyed
                    break;
                }
            }
            
            // If current asteroid is not destroyed, push it to the stack
            if (!isDestroyed) {
                stack.push(asteroid);
            }
        }
        
        // Convert stack to array for result
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
