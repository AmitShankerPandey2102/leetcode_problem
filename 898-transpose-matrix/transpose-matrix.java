class Solution {
    public int[][] transpose(int[][] mat) {
        int m = mat.length;        // rows = 2
        int n = mat[0].length;     // cols = 3
        
        int[][] result = new int[n][m]; // 3 x 2
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = mat[i][j];
            }
        }
        
        return result;
    }
}