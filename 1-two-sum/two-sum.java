class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length;i++)
        {
            int result = target - nums[i];
            if (map.containsKey(result)){
                return new int[]{ map.get (result),i};

            }
            map.put (nums[i],i);
        }
        return null;
        
    }
}