import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        
        // Check for empty matrix
        if (matrix == null || matrix.length == 0) {
            return spiral;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        // Loop through the matrix in spiral order
        while (top <= bottom && left <= right) {
            
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++; // Move top boundary down
            
            // Traverse down along the right column
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--; // Move right boundary left
            
            // Traverse from right to left along the bottom row
            if (top <= bottom) { // Check to ensure the current row is valid
                for (int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--; // Move bottom boundary up
            }

            // Traverse up along the left column
            if (left <= right) { // Check to ensure the current column is valid
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++; // Move left boundary right
            }
        }

        return spiral;
    }
}
leetcode solution tomorrow re do it