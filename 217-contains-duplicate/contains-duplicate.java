class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet boo = new HashSet();

        for ( int i =0; i< nums.length;i++)
        {
          if (boo.contains(nums[i]))
          {
            return true;
          }
          boo.add(nums[i]);
        }

        return false;
    }
}