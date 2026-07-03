class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        map={i:0 for i in range(1,len(nums)+1)}
        for i in nums:
            map[i]+=1
        dup=-1
        miss=-1
        for i in map.keys():
            if map[i]==2:
                dup=i
            if map[i]==0:
                miss=i
        return [dup,miss]
                