class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) {
                return true; 
            }
            res.put(nums[i], true);
        }
        return false; 
    }
}
