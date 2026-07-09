from typing import List

class Solution:
    def pathExistenceQueries(self, n: int, nums: List[int], maxDiff: int, queries: List[List[int]]) -> List[bool]:
        # Array to store the component ID for each node
        components = [0] * n
        
        # ID for the current connected component
        curr_component = 0
        
        # Traverse the sorted array and assign component IDs
        for i in range(1, n):
            # If the difference exceeds maxDiff, the bridge is broken!
            # We start a new component.
            if nums[i] - nums[i-1] > maxDiff:
                curr_component += 1
            
            components[i] = curr_component
            
        # Answer queries: a path exists if both nodes are in the same component
        ans = []
        for u, v in queries:
            ans.append(components[u] == components[v])
            
        return ans