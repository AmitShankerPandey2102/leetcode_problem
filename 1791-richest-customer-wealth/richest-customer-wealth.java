class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int row=0;row<accounts.length;row++){
            int c=0;
            for(int col=0;col<accounts[row].length;col++){
                c+=accounts[row][col];
            }
            if (c>max){
                max=c;
            }
        }
        return max;
    }
}