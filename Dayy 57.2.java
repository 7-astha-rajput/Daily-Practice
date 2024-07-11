class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Store the original number
        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // Check for overflow/underflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return false;
            }

            reversed = reversed * 10 + pop;
        }

        // Check if the reversed number is the same as the original
        return original == reversed;
    }
}
