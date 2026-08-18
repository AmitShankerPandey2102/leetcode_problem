class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;

        // Cyclic Sort
        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] >= 1 && nums[i] <= nums.length
                    && nums[i] != nums[correct]) {

                swap(nums, i, correct);

            } else {
                i++;
            }
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();

        for (i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}