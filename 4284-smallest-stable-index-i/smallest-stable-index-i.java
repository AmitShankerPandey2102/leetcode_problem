class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int[] mins=new int[nums.length];
        mins[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            mins[i]=Math.min(nums[i],mins[i+1]);
        }
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int stb=max-mins[i];
            if(stb<=k) return i;
        }
        return -1;
    }
}