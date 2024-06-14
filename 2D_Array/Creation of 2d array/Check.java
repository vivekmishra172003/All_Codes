import java.util.*; // Importing the Scanner class from java.util package

public class Check {
    public static void main(String[] args) {
        System.out.println("Check"); // Printing a message to indicate the start of the program
        
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the user

        // Prompting the user to enter the number of rows for the matrix
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt(); // Reading the number of rows from the user

        // Prompting the user to enter the number of columns for the matrix
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt(); // Reading the number of columns from the user

        // Initializing a 2D array (matrix) with the specified number of rows and columns
        int[][] matrix = new int[rows][cols];

        // Loop through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column of the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Prompting the user to enter the element for the current position in the matrix
                System.out.println("Enter the element for matrix[" + i + "][" + j + "]:");
                matrix[i][j] = sc.nextInt(); // Reading the element and storing it in the matrix
            }
        }

        // Printing the matrix to verify the input
        System.out.println("The matrix is:");
        // Loop through each row of the matrix to print its elements
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column of the current row to print its elements
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // Printing the element followed by a space
            }
            System.out.println(); // Moving to the next line after printing all elements of the current row
        }
    }
}
