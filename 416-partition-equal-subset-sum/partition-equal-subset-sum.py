class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        total = sum(nums)
        if total % 2 :
            return False
        reqd = total / 2
        
        stack = [0]
        for ele in nums:
            new = set()
            for ele2 in stack:
                if ele + ele2 == reqd:
                    return True
                elif ele + ele2 < reqd:
                    new.add(ele+ele2)
                new.add(ele2)
            stack = list(new)
        return False