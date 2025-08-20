class Solution:
    def mostFrequentEven(self, nums):
        freq = {}  # Dictionary to store frequency of even numbers
        
        for n in nums:
            if n % 2 == 0:  # Check if the number is even
                if n in freq:
                    freq[n] += 1
                else:
                    freq[n] = 1
        
        if not freq:
            return -1  # No even numbers found
        
        # Find the most frequent even number
        max_count = -1
        result = -1
        for number in freq:
            if freq[number] > max_count:
                max_count = freq[number]
                result = number
            elif freq[number] == max_count and number < result:
                result = number
        
        return result
