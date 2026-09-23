class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        //  copy of original array because we dont want to create new row and column to zero which is creating by original zero given in question 
        int[][] original = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = matrix[i][j];
            }
        }

        // Check original matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (original[i][j] == 0) {

                    // Make entire row zero
                    for (int k = 0; k < cols; k++) {
                        matrix[i][k] = 0;
                    }

                    // Make entire column zero
                    for (int k = 0; k < rows; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
    }
}