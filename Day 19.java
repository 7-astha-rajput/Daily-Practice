class Solution {
    public String removeStars(String s) {
        // Using a stack to store the characters
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (c == '*') {
                // If the current character is a star, pop the top element from the stack
                stack.pop();
            } else {
                // Otherwise, push the current character onto the stack
                stack.push(c);
            }
        }
        
        // Build the result string from the characters in the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        // Convert StringBuilder to String and return
        return result.toString();
    }
}
