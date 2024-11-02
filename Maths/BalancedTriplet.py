
import math
class Solution:
    def minOps(self, a : int, b : int, c : int) -> int:
        v = [a, b, c]
        v.sort()

        x = v[1] - v[0]
        y = v[2] - v[1]

        ans = math.ceil(abs(x - y) / 2.0)

        return ans
