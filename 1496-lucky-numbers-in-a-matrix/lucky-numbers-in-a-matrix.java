class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
         int max = Integer.MIN_VALUE;
         List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
             int min = Integer.MAX_VALUE;
             int minidx=-1;
             for(int j=0;j<m;j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                    minidx = j;
                }
             } 
              int max1=0;
             for(int k=0;k<n;k++){
                   max1 = Math.max(max1,matrix[k][minidx]);
                }
              if(max1==min){
               if(l.size()==0) l.add(max1);
              }  
        }
        return l;
        
    }
}