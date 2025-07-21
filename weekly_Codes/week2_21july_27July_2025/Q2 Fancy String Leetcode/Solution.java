class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        // Process ALL characters from 0 to n-1
        for(int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            
            // Check if adding this character would create three consecutive identical characters
            // We need at least 2 characters in our result to have this problem
            if(sb.length() >= 2 && 
               sb.charAt(sb.length() - 1) == currentChar && 
               sb.charAt(sb.length() - 2) == currentChar) {
                
                // Skip this character - adding it would create three in a row
                continue;
            }
            
            // Safe to add this character to our result
            sb.append(currentChar);
        }
        
        return sb.toString();
    }
}

// Here's an alternative approach that's closer to your original thinking:
class SolutionAlternative {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        // Handle edge cases first
        if(n == 0) return "";
        if(n == 1) return s;
        if(n == 2) return s;
        
        // Add first character (always safe)
        sb.append(s.charAt(0));
        
        // Process characters starting from index 1
        for(int i = 1; i < n; i++) {
            char currentChar = s.charAt(i);
            
            // Check if we would create three consecutive identical characters
            if(i >= 2 && s.charAt(i-1) == currentChar && s.charAt(i-2) == currentChar) {
                // Skip this character - it would create three in a row
                continue;
            }
            
            // Safe to add this character
            sb.append(currentChar);
        }
        
        return sb.toString();
    }
}