class Solution {
    public int smallestDivisor(int[] nums, int thd) {
        int max=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(divide(nums,mid)<=thd){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private static int divide(int[] nums,int div){
        int sum=0;
        for(int num:nums){
            sum+=((num+div-1)/div);
        }
        return sum;
    }
}