class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0 as per the problem statement
        if (needle.length() == 0) {
            return 0;
        }
        
        // Use indexOf method to find the first occurrence of needle in haystack
        int index = haystack.indexOf(needle);
        
        return index;
    }
}
