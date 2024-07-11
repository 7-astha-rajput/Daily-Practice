class Solution {
    public String intToRoman(int num) {
        // Define values and their corresponding symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // StringBuilder for constructing the result
        StringBuilder roman = new StringBuilder();

        // Iterate over the values and symbols arrays
        for (int i = 0; i < values.length; i++) {
            // Append the symbol while the value can be subtracted from num
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return roman.toString();
    }
}
