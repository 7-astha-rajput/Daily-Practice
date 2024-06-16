import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        // List to map each digit to its corresponding letters
        String[] mapping = {
            "",    // 0 (not used)
            "",    // 1 (not used)
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
        };
        
        // List to store the result
        List<String> result = new ArrayList<>();
        
        // Edge case: if the input is an empty string, return an empty list
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        // Helper function for backtracking
        backtrack(result, digits, mapping, 0, new StringBuilder());
        return result;
    }
    
    private void backtrack(List<String> result, String digits, String[] mapping, int index, StringBuilder current) {
        // Base case: if the current combination is the same length as the input digits
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        // Get the letters corresponding to the current digit
        String letters = mapping[digits.charAt(index) - '0'];
        
        // Iterate over each letter and recursively build the combinations
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, digits, mapping, index + 1, current);
            current.deleteCharAt(current.length() - 1); // backtrack by removing the last character
        }
    }
}
