class Solution {
    public void rotate(int[][] matrix) {
        // int n = matrix.length;
        // int[][] ans = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         ans[j][n - 1 - i] = matrix[i][j];
        //     }
        // }

        // // copy ans back into matrix
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         matrix[i][j] = ans[i][j];
        //     }
        // }

                int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}