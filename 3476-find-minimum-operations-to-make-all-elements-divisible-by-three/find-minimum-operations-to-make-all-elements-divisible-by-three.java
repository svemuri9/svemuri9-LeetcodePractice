class Solution {
    public int minimumOperations(int[] nums) {
        if (nums.length==0) return 0;
        int count=0;
        for (int i =0; i<nums.length;i++)
        {
            if (nums[i]%3==0)
            continue;
            else if ((nums[i]+1)%3==0)
            count++;
            else if ((nums[i]-1)%3==0)
            count++;
            else count = count +2;
        }
        return count;        
    }
}