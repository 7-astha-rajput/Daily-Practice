import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        // If the lengths of the strings are different, they cannot be close
        if (word1.length() != word2.length()) {
            return false;
        }

        // Frequency arrays for both words
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // Unique characters sets for both words
        boolean[] chars1 = new boolean[26];
        boolean[] chars2 = new boolean[26];

        // Populate frequency arrays and character sets
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            chars1[c - 'a'] = true;
        }

        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            chars2[c - 'a'] = true;
        }

        // Check if both words have the same unique characters
        for (int i = 0; i < 26; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }

        // Sort the frequency arrays to compare the frequencies
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Check if the sorted frequency arrays are the same
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.closeStrings("abc", "bca")); // Output: true
        System.out.println(solution.closeStrings("a", "aa")); // Output: false
        System.out.println(solution.closeStrings("cabbba", "abbccc")); // Output: true
    }
}
