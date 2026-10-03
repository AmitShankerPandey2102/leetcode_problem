class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;

        int pivotIndex = pivot(nums, n);

        return nums[pivotIndex];
    }

    public int pivot(int[] nums, int n) {

        int l = 0;
        int r = n - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                // Minimum is on the right
                l = mid + 1;
            }

            else if (nums[mid] < nums[r]) {
                // Minimum is at mid or on the left
                r = mid;
            }

            else {
                // nums[mid] == nums[r]
                // Can't decide, so safely reduce r
                r--;
            }
        }

        return l;
    }
}