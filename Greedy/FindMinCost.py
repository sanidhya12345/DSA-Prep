from typing import List


class Solution:
    def minCost(self, n : int, a : List[int]) -> int:
        # code here
        a.sort()
        e=0;
        o=0;
        for i in a:
            if i%2==0:
                e+=i
            else:
                o+=i
        return min(e,o)
               

