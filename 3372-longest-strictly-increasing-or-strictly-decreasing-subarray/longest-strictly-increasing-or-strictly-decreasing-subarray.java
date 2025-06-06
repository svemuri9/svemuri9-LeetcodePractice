class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int longestLength = 1;
        int increasingLength = 1;
        int decreasingLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increasingLength++;
                decreasingLength = 1;
            } else if (nums[i] < nums[i - 1]) {
                decreasingLength++;
                increasingLength = 1;
            } else {
                increasingLength = 1;
                decreasingLength = 1;
            }

            longestLength = Math.max(longestLength, Math.max(increasingLength, decreasingLength));
        }

        return longestLength;
    }

}