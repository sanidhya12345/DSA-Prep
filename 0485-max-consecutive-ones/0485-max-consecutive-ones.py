class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxcount=-1
        count=0
        for i in nums:
            if i==1:
                count+=1
            else:
                maxcount=max(maxcount,count)
                count=0
        maxcount=max(maxcount,count)
        return maxcount