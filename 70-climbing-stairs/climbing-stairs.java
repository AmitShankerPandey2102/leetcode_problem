class Solution {
    public int climbStairs(int n) {
        int first=0,second=1;
        int last=0;
        if(n<=3) return n;
        for(int i=0;i<n;i++){
            last=first+second;
            first=second;
            second=last;
        }
        return last;
    }
} 