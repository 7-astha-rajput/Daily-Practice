class Solution {
    public int maxVowels(String s, int k) {
        // Set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        int maxVowelsCount = 0;
        int currentVowelsCount = 0;
        
        // Initialize the count of vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowelsCount++;
            }
        }
        
        // Initial max vowels count
        maxVowelsCount = currentVowelsCount;
        
        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            // Remove the effect of the character that is sliding out of the window
            if (vowels.contains(s.charAt(i - k))) {
                currentVowelsCount--;
            }
            
            // Add the effect of the character that is sliding into the window
            if (vowels.contains(s.charAt(i))) {
                currentVowelsCount++;
            }
            
            // Update the maximum count of vowels
            maxVowelsCount = Math.max(maxVowelsCount, currentVowelsCount);
        }
        
        return maxVowelsCount;
    }
}
