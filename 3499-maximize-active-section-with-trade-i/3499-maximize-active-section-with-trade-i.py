class Solution:
    def maxActiveSectionsAfterTrade(self, s: str) -> int:
        initial_ones = s.count('1')
    
        # Augment the string as required
        t = '1' + s + '1'
        
        # Group the string into contiguous blocks
        groups = [(char, len(list(group))) for char, group in itertools.groupby(t)]
        
        # Extract lengths of all 0-blocks and 1-blocks
        Z = [length for char, length in groups if char == '0']
        O = [length for char, length in groups if char == '1']
        
        # Internal 1-blocks (ignoring the ones at the absolute edges)
        internal_O = O[1:-1]
        
        # If there are no internal 1-blocks, a trade is impossible
        if not internal_O:
            return initial_ones
            
        max_gain = 0
        
        # Pre-sort Z by size descending to easily find the max block for Option 2
        Z_sorted = sorted([(val, idx) for idx, val in enumerate(Z)], reverse=True)
        
        for i, o_len in enumerate(internal_O):
            # Option 1: Flip the newly merged block (Left Z + Right Z)
            gain1 = Z[i] + Z[i+1]
            
            # Option 2: Flip the largest available Z block elsewhere
            gain2 = -float('inf')
            for val, idx in Z_sorted:
                # Must not be the left or right neighbor we just merged
                if idx != i and idx != i + 1:
                    gain2 = val - o_len
                    break 
                    
            # Update the maximum possible gain (starts at 0, representing "no trade")
            max_gain = max(max_gain, gain1, gain2)
            
        return initial_ones + max_gain



