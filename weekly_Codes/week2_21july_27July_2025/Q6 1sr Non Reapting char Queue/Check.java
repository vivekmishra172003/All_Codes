import java.util.*;
class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        // step 1 : 
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
                // Step 2: Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        // Step 3: If no non-repeating character found
        return '$';
        
    }
}


https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

// baad me isko queue se karunga