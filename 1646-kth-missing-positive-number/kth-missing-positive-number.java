class Solution {
    public int findKthPositive(int[] arr, int k) {
        boolean[] freq=new boolean[2001];
        for(int num:arr){
            freq[num]=true;
        }
        for(int i=1;i<2001;i++){
            if(!freq[i] && k==1){
                return i;
            }else if(!freq[i]) k--;
        }
        return -1;
    }
}