class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        
        // Convert both numbers to positive
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        int result = 0;
        
        // Perform bitwise division
        while (absDividend >= absDivisor) {
            long temp = absDivisor, multiple = 1;
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            absDividend -= temp;
            result += multiple;
        }
        
        // Apply the sign to the result
        return isNegative ? -result : result;
    }
}
