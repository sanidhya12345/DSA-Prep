class Solution:
    def removeCoveredIntervals(self, intervals: list[list[int]]) -> int:
        intervals.sort(key=lambda x: (x[0], -x[1]))
        
        remaining_intervals = 0
        max_end = -1
        
        for start, end in intervals:
            if end > max_end:
                remaining_intervals += 1
                max_end = end  
                
        return remaining_intervals