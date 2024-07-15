class Solution {
    public String printString(String s, char ch, int count) {
        // Iterate through the string to find the 'count'-th occurrence of 'ch'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count--;
                // When 'ch' has appeared 'count' times, return the remaining substring
                if (count == 0) {
                    return s.substring(i + 1);
                }
            }
        }
        // If 'ch' doesn't appear 'count' times, return an empty string
        return "";
    }
}
