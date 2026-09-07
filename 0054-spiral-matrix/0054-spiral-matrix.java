import java.util.*;

class Solution {
    // Function to return matrix in spiral order
    public List spiralOrder(int[][] matrix) {
        // Result list to store the spiral order
        List result = new ArrayList<>();

        // Initialize boundaries
        int starting_row = 0;                        // Starting row
        int ending_row = matrix.length - 1;     // Ending row
        int starting_column = 0;                       // Starting column
        int ending_column = matrix[0].length - 1;   // Ending column

        // Loop until all elements are traversed
        while (starting_row <= ending_row && starting_column <= ending_column) {

            // Traverse the starting_row row from starting_column to ending_column
            for (int i = starting_column; i <= ending_column; i++) {
                result.add(matrix[starting_row][i]);
            }
            starting_row++; // Move the starting_row boundary downward

            // Traverse the ending_column column from starting_row to ending_row
            for (int i = starting_row; i <= ending_row; i++) {
                result.add(matrix[i][ending_column]);
            }
            ending_column--; // Move the ending_column boundary starting_columnward

            // Traverse the ending_row row from ending_column to starting_column (only if rows remain)
            if (starting_row <= ending_row) {
                for (int i = ending_column; i >= starting_column; i--) {
                    result.add(matrix[ending_row][i]);
                }
                ending_row--; // Move the ending_row boundary upward
            }

            // Traverse the starting_column column from ending_row to starting_row (only if columns remain)
            if (starting_column <= ending_column) {
                for (int i = ending_row; i >= starting_row; i--) {
                    result.add(matrix[i][starting_column]);
                }
                starting_column++; // Move the starting_column boundary ending_columnward
            }
        }

        // Return the spiral order result
        return result;
    }
}

