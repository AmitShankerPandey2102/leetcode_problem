class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        boolean[] visited = new boolean[n + 1];

        for(int i = 0; i < nums.length; i++) {
            visited[nums[i]] = true;
        }

        for(int i = 0; i < visited.length; i++) {
            if(!visited[i]) {
                return i;
            }
        }

        return -1;
    }
}