class Solution {
    static int oddCells(int m, int n, int[][] indices) {
        int[][] array = new int[m][n];
        int odd =0;
        for (int i = 0; i < indices.length; i++) {
            int a = 0;
            int incRow = indices[i][a++];
            for (int j = 0; j < n; j++) {
                array[incRow][j]++;
            }

            int incCol = indices[i][a];
            for (int j = 0; j < m; j++) {
                array[j][incCol]++;
            }
        }

        for(int[] tempArr : array)
            for(int num:tempArr)
                if(num%2!=0)
                    odd++;

        return odd;
    }
}