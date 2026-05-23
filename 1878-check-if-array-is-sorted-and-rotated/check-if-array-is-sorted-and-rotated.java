class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int idx = -1;

        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){

                if(idx != -1){
                    return false;
                }
                idx = i;
            }
        }

        if(idx == -1){
            return true;
        }

        return nums[n - 1] <= nums[0];
    }
}