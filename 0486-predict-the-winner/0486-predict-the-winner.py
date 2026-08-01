class Solution:
    def predictTheWinner(self, nums: List[int]) -> bool:
        n=len(nums)
        dp=[[0]*n for _ in range(n)]
        
        for i in range(0,n):
            dp[i][i]=nums[i]

        for l in range(2,n+1):
            for i in range(0,n-l+1):
                j=i+l-1

                pickleft=nums[i]-dp[i+1][j]
                pickright=nums[j]-dp[i][j-1]

                dp[i][j]=max(pickleft,pickright)

        return dp[0][n-1]>=0