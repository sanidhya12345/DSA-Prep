class Solution:
    def maxDigitRange(self, nums: list[int]) -> int:
        
        map=collections.defaultdict(int)
        map2=collections.defaultdict(int)
        for i in nums:
            maxi=int(max(list(str(i))))
            mini=int(min(list(str(i))))
            diff=maxi-mini
            map[i]=diff
            map2[i]+=1
        maxdiff=max(map.values())
        return sum([i*map2[i] for i in map.keys() if map[i]==maxdiff])