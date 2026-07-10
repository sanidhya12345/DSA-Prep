import bisect
from typing import List

class Solution:
    def pathExistenceQueries(self, n: int, nums: List[int], maxDiff: int, queries: List[List[int]]) -> List[int]:
        # 1. Sort the array values
        arr = sorted(nums)
        
        # Max powers of 2 needed (since 2^17 > 10^5, 18 is a safe bound for arrays up to length 10^5)
        LOG = 18 
        
        # Initialize tables for 2^k jumps
        R = [[0] * LOG for _ in range(n)]
        L = [[0] * LOG for _ in range(n)]
        
        # 2. Precompute the Base Cases (k = 0, which means exactly 1 step)
        for i in range(n):
            # Furthest right node reachable in 1 step
            r_val = arr[i] + maxDiff
            R[i][0] = bisect.bisect_right(arr, r_val) - 1
            
            # Furthest left node reachable in 1 step
            l_val = arr[i] - maxDiff
            L[i][0] = bisect.bisect_left(arr, l_val)
            
        # 3. Build the Binary Lifting tables for 2^k steps
        for k in range(1, LOG):
            for i in range(n):
                # To jump 2^k steps, we first jump 2^(k-1) steps, then jump another 2^(k-1) steps 
                # from that new position.
                R[i][k] = R[ R[i][k-1] ][ k-1 ]
                L[i][k] = L[ L[i][k-1] ][ k-1 ]
                
        # 4. Answer the Queries
        ans = []
        for u, v in queries:
            if u == v:
                ans.append(0)
                continue
                
            val_u = nums[u]
            val_v = nums[v]
            
            # If values are identical, difference is 0 <= maxDiff, so distance is exactly 1
            if val_u == val_v:
                ans.append(1)
                continue
                
            # Find their starting and ending positions in the sorted array
            start = bisect.bisect_left(arr, val_u)
            end = bisect.bisect_left(arr, val_v)
            
            # Scenario A: Moving RIGHT
            if start < end:
                curr = start
                steps = 0
                
                # Jump as far as possible without exceeding or reaching the 'end'
                for k in range(LOG - 1, -1, -1):
                    if R[curr][k] < end:
                        curr = R[curr][k]
                        steps += (1 << k)
                        
                # After maxing out our jumps, we are exactly 1 step away.
                # Let's verify if taking 1 more step actually reaches 'end'
                if R[curr][0] >= end:
                    ans.append(steps + 1)
                else:
                    ans.append(-1) # The path is broken / Unreachable component
                    
            # Scenario B: Moving LEFT
            else: 
                curr = start
                steps = 0
                
                for k in range(LOG - 1, -1, -1):
                    if L[curr][k] > end:
                        curr = L[curr][k]
                        steps += (1 << k)
                        
                if L[curr][0] <= end:
                    ans.append(steps + 1)
                else:
                    ans.append(-1)
                    
        return ans