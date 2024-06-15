class Solution {
    public int compress(char[] chars) {
        // Index for writing the compressed characters to the array
        int writeIndex = 0;

        // Loop through each character in the array
        for (int i = 0; i < chars.length; ) {
            // The current character to be processed
            char currentChar = chars[i];
            // Start counting occurrences from the current position
            int count = 0;

            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            // Write the character to the array
            chars[writeIndex++] = currentChar;

            // If the count is greater than 1, write the count as well
            if (count > 1) {
                // Convert the count to a string and then to a character array
                char[] countChars = Integer.toString(count).toCharArray();
                // Write each digit of the count to the array
                for (char c : countChars) {
                    chars[writeIndex++] = c;
                }
            }
        }

        // Return the new length of the compressed array
        return writeIndex;
    }
}
