class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==0:
            return 0
        zero =0
        for i in range (len(nums)):
            if nums[i]!=0:
                nums[zero],nums[i]=nums[i],nums[zero]
                zero+=1
                
        