import java.util.Arrays;
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
       int length =nums.length/2;
        double [] ans = new double[length];
        int i =0, j=nums.length-1;

            for (int k =0; k<length; k++)
            {
                ans[k]=(nums[i]+nums[j])/2.0;
                i++;
                j--;
            }

        Arrays.sort(ans);
        return ans[0];
        
    }
}