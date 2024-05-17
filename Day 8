class Solution {
    public int compress(char[] chars) {
        int write = 0; // Write pointer
        int read = 0;  // Read pointer
        int n = chars.length;
        
        while (read < n) {
            char currentChar = chars[read];
            int count = 0;
            
            // Count the number of occurrences of the current character
            while (read < n && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character to the array
            chars[write++] = currentChar;
            
            // Write the count if greater than 1
            if (count > 1) {
                // Convert count to string and write each character
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        // Return the new length of the array
        return write;
    }
}
