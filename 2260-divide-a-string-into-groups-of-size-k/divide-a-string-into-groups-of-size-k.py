class Solution:
    def divideString(self, s: str, k: int, fill: str) -> list[str]:
        ans=[]
        
        for i in range(0,len(s),k):
            ans.append(s[i:i+k])

        ans[-1] = ans[-1].ljust(k, fill)

        return ans