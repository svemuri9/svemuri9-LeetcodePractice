class Solution:
    def maximum69Number(self, num: int) -> int:
        # Convert the number to a string so we can work with individual digits
        num_str = str(num)
        
        # Replace the first occurrence of '6' with '9' to get the maximum number
        updated_num_str = num_str.replace('6', '9', 1)
        
        # Convert the modified string back to an integer and return it
        return int(updated_num_str)
