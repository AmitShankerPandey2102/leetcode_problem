class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans = {-1,-1};
        int start = search(nums, target, true); // first occuerence dundh ke do ... 
        int end = search(nums, target, false); // last occurence dundh ke do ...
        ans[0] = start;
        ans[1] = end;
        return ans ;
    }
    // this function just return the index value of a target ..

     int search (int[]nums, int target ,boolean findstartindex){
        int ans = -1 ;   // agar target nahi mila tho ..
        int start =0 ;
        int end = nums.length -1; 
        while (start<=end){
            int mid = start + (end-start)/2;
            
            if (target < nums[mid]){
                end = mid-1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                ans = mid ;
                if (findstartindex){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }   // may be the mid will be the answer but check left and right both ....
            }

        }
        return ans ;
     
    }

}
