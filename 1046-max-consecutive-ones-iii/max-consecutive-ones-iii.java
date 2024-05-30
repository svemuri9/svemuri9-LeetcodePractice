class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int l = 0;
        int r = 0;
        int c = 0;
        int max = 0;

        while(r < n){
            if(nums[r] == 1){
                
            }
            else{
                c++;
                if(c <= k){
                    
                }
                else{
                    while(c > k){
                        if(nums[l] == 0){
                            c--;
                        }
                        l++;
                    }
                }
            }
            max = Math.max(max , r-l+1);
            r++;
        }

        return max;
    }
}