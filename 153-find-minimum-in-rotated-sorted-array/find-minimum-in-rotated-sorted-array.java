class Solution {
    public int findMin(int[] nums) {
        int min=0;
        int j=nums.length-1;
        int i=0;
        if(nums.length==1) return nums[0];
        while(i<j){
            if(nums[i]<nums[j]){
                min=nums[i];
                j--;
            }
            else{
                min=nums[j];
                i++;
            }
        }
        return min;
    }
}