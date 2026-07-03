class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        x=nums[:n]
        y=nums[n:]
        ans=[]
        for i,j in zip(x,y):
            ans.append(i)
            ans.append(j)
        return ans