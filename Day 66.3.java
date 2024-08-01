import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        
        // Create a frequency map of the words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        // Traverse through the string with sliding window approach
        for (int i = 0; i <= s.length() - totalLen; i++) {
            String currentSubstring = s.substring(i, i + totalLen);
            if (isConcatenation(currentSubstring, wordMap, wordLen)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    private boolean isConcatenation(String s, Map<String, Integer> wordMap, int wordLen) {
        Map<String, Integer> seenWords = new HashMap<>();
        
        for (int j = 0; j < s.length(); j += wordLen) {
            String word = s.substring(j, j + wordLen);
            if (!wordMap.containsKey(word)) {
                return false;
            }
            seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
            if (seenWords.get(word) > wordMap.get(word)) {
                return false;
            }
        }
        
        return true;
    }
}
