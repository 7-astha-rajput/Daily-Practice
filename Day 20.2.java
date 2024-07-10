import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int index = 0;
        
        while (index < s.length()) {
            char ch = s.charAt(index);
            
            if (Character.isDigit(ch)) {
                // If the character is a digit, calculate the complete number
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            } else if (ch == '[') {
                // Push the current result and count onto the stacks
                resultStack.push(result);
                result = new StringBuilder();
                index++;
            } else if (ch == ']') {
                // Pop the count and the previous result
                int repeatTimes = countStack.pop();
                StringBuilder temp = result;
                result = resultStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    result.append(temp);
                }
                index++;
            } else {
                // Append the current character to the result
                result.append(ch);
                index++;
            }
        }
        
        return result.toString();
    }
}
