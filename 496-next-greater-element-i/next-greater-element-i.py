class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        for num in nums1:
            found = False
            next_greater = -1
            for i in range(len(nums2)):
                if nums2[i] == num:
                    found = True
                if found and nums2[i] > num:
                    next_greater = nums2[i]
                    break
            res.append(next_greater)
        return res
