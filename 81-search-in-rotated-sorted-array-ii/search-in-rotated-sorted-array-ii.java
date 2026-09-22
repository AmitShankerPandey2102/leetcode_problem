class Solution {

    public boolean search(int[] nums, int target) {
        int n = nums.length;

        int pivotIndex = pivot(nums, n);

        int idx = binarySearch(nums, 0, pivotIndex - 1, target);

        if (idx != -1) {
            return true;
        }

        idx = binarySearch(nums, pivotIndex, n - 1, target);

        return idx != -1;
    }

    public int pivot(int[] nums, int n) {
        int l = 0;
        int r = n - 1;

        while (l < r && nums[l] == nums[l + 1]) {
            l++;
        }

        while (l < r && nums[r] == nums[r - 1]) {
            r--;
        }

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return r; // minimum element index
    }

    public int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}