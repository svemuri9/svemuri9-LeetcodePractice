from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        answer = [1] * n  # initialize result array with 1s

        # Step 1: Prefix product
        prefix = 1
        for i in range(n):
            answer[i] = prefix
            prefix *= nums[i]

        # Step 2: Postfix product
        postfix = 1
        for i in range(n - 1, -1, -1):
            answer[i] *= postfix
            postfix *= nums[i]

        return answer
