class Solution:
    def isPalindrome(self, x: int) -> bool:
        ans, reverse=0,0
        if x<0:
            return False
        dummy=x
        while dummy >0:
            ans=dummy%10
            reverse=(reverse*10)+ans
            dummy=dummy//10
        return reverse==x
            
        