class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        nums.sort()
        count = 0
        n = len(nums)
        
        # Iterate through the array, fixing the largest side c
        for c in range(n - 1, 1, -1):
            a, b = 0, c - 1
            while a < b:
                # Check if nums[a] + nums[b] > nums[c]
                if nums[a] + nums[b] > nums[c]:
                    # If it is valid, all pairs (a, a+1, ..., b) with b are valid
                    count += (b - a)
                    b -= 1  # Move the upper pointer down
                else:
                    a += 1  # Move the lower pointer up
        
        return count