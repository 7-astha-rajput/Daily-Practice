class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;
        
        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        // Check for sub-strings of length 2.
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        
        // Check for lengths greater than 2. k is length of substring
        for (int k = 3; k <= n; k++) {
            // Fix the starting index
            for (int i = 0; i < n - k + 1; i++) {
                // Get the ending index of substring from starting index i and length k
                int j = i + k - 1;
                
                // Check for sub-string from i to j
                // If s.charAt(i) == s.charAt(j) and dp[i+1][j-1] is true
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        
        return s.substring(start, start + maxLength);
    }
}
