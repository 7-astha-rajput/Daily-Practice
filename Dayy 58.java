class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as the initial prefix
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string in the array
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
