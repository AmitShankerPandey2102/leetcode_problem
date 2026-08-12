class Solution {

    // Find peak index
    public int peakIndexInMountainArray(MountainArray mountainArr) {

        int n = mountainArr.length();

        int l = 0;
        int r = n - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                // We are on ascending side
                l = mid + 1;
            } 
            else {
                // We are on descending side
                r = mid;
            }
        }

        return l;
    }


    // Binary Search on ascending part
    public int binarySearch(MountainArray mountainArr, int l, int r, int target) {

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } 
            else if (mountainArr.get(mid) > target) {
                r = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }

        return -1;
    }


    // Binary Search on descending part
    public int reverseBinarySearch(MountainArray mountainArr, int l, int r, int target) {

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            } 
            else if (mountainArr.get(mid) > target) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        return -1;
    }


    // Main function
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();

        // Step 1: Find peak
        int idx = peakIndexInMountainArray(mountainArr);


        // Step 2: Search in ascending part
        int result_idx = binarySearch(
            mountainArr,
            0,
            idx,
            target
        );

        if (result_idx != -1) {
            return result_idx;
        }


        // Step 3: Search in descending part
        result_idx = reverseBinarySearch(
            mountainArr,
            idx + 1,
            n - 1,
            target
        );

        return result_idx;
    }
}