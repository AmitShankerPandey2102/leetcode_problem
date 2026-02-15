 class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];                       // copy the element for the first half 
            ans[i + n] = nums[i];                   // copy the element for the second half for concatenation.
        }
        
        return ans;
    }
}

 
 
