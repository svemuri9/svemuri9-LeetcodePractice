'''
1. the premise is m * k <= len(nums)
2. if all flowers have bloomed, we can make m bouquets with k flowers
3. if day is larger, it is more possible to make m bouquets with k flowers
4. if day is smaller, it is more impossible to make m bouquets with k flowers
5. if day is given, we can greedily collect k adjacent blooming flowers to make m bouquets
6. tc is O(nlog(max(bloomDay))), sc is O(1)

day              1 2 3 6 4 5 6 7 8 9
get m bouquets   0 0 0 0 0 0 1 1 1 1 
when day is increasing, get m bouquets also keep in non-decreasing order.
use binary seach to find minimun day such that get m bouquets(day) == 1.

'''
class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        if m * k > len(bloomDay): return -1
        left, right = 1, max(bloomDay)
        def check(day:int)-> int:
            cnt = 0
            length = 0
            for x in bloomDay:
                if x > day:
                    length = 0
                else: 
                    length += 1
                    if length == k:
                        cnt += 1
                        if cnt == m: return 1
                        length = 0
            return 0

        ans = bisect_left(range(left, right+1), 1, key=check) + 1
        return -1 if ans == right + 1 else ans