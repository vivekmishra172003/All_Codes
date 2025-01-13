
class Solution {
    public String reverseString(String s) {
        // Using LinkedHashSet to maintain insertion order while removing duplicates
        LinkedHashSet<Character> charset = new LinkedHashSet<>();
        
        // Traverse the string from end to start to achieve reverse order of unique characters
        for (int i = s.length() - 1; i >= 0; i--) { // Correction: Looping from end to start
            char ch = s.charAt(i);
            if (ch != ' ') { // Ignore spaces
                charset.add(ch);
            }
        }
        
        // Constructing the result string using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (Character c : charset) {
            sb.append(c);
        }
        
        // Directly return the constructed string as no reverse is needed here
        return sb.toString(); // Correction: Removed `sb.reverse()` because we traversed in reverse order already
    }
}