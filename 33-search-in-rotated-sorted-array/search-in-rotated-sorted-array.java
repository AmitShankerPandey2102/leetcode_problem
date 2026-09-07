class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int pivot_index = findpivot(nums, n);

        // Left side of pivot
        int idx = binarySearch(nums, 0, pivot_index - 1, target);

        if (idx != -1) {
            return idx;
        }

        // Right side including pivot
        idx = binarySearch(nums, pivot_index, n - 1, target);

        return idx;
    }

    public int findpivot(int[] nums, int n) {
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return r;
    }

    public int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        return -1;
    }
}