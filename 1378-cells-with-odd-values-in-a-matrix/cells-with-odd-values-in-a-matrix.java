class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        int count = 0;
        for (int k = 0; k < indices.length; k++) {
            int r1 = indices[k][0];
            int c1 = indices[k][1];
            for (int j = 0; j < n; j++) {
                matrix[r1][j]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][c1]++;
            }

        }
        for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
        if (matrix[i][j] % 2 != 0) {
            count++;
        }
    }
}
return count;
    }
}