class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        n=len(nums)
        st=set()
        for i in range(n):
            for j in range(i+1,n):
                d=set()
                for k in range(j+1,n):
                    s=nums[i]+nums[j]+nums[k]
                    fourth=target-s
                    if fourth in d:
                        temp=[nums[i],nums[j],nums[k],fourth]
                        temp.sort()
                        st.add(tuple(temp))
                    d.add(nums[k])
        ans=[list(i) for i in st]
        return ans